package module13.superCoolCurrencyBot;

import java.util.ArrayList;
import java.util.List;
import module13.superCoolCurrencyBot.enums.Currency;
import module13.superCoolCurrencyBot.service.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

// тепер бот працює і з приватом і з монобанком. можна додати будь які інши ресурси з курсом валют
public class CurrencyBot extends TelegramLongPollingBot {

    private RateOperationsService rateOperationsService = new RateOperationsService();

    @Override
    public String getBotUsername() {
        return "додайте свій";
    }

    @Override
    public String getBotToken() {
        return "додайте свій";
    }

    // accepted commands: buy, sell, usd, eur
    @Override
    public void onUpdateReceived(Update update) {
        try {
            if (update.hasMessage()) {
                Message message = update.getMessage();
                if (message.hasText()) {
                    resolveMessage(message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resolveMessage(Message message) throws TelegramApiException {
        SendMessage sendMessage;
        String command = message.getText();
        command = command.toUpperCase();

        if ("/START".equals(command)){
            sendMessage = getStartMenu(message);
            execute(sendMessage);
            return;
        }

        Currency currency = null;
        try {
            currency = Currency.valueOf(command);
        } catch (IllegalArgumentException e) {
            //NOP
        }
        if (currency != null) {
            sendMessage = getTextMessage(message,PrettyRateResponseService.formBestRateResponse(rateOperationsService.getBestRates(currency)));
        } else {
            sendMessage = getTextMessage(message, PrettyRateResponseService.formAllRateResponse(command, rateOperationsService.getActualRates()));
        }

        execute(sendMessage);

    }

    private SendMessage getTextMessage(Message message, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableHtml(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        return sendMessage;
    }

    private SendMessage getStartMenu(Message message){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("BUY");
        keyboardFirstRow.add("SELL");

        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("USD");
        keyboardSecondRow.add("EUR");

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);


        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
}

