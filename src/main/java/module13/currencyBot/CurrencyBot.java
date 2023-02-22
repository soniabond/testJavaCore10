package module13.currencyBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class CurrencyBot extends TelegramLongPollingBot {

    private CurrencyRertrievalService currencyRertrievalService = new CurrencyRertrievalPrivatService();

    @Override
    public String getBotUsername() {
        return "напишіть свій";
    }

    @Override
    public String getBotToken() {
        return "напишіть свій";
    }

    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(
                    PrettyRateResponseService.formRateResponse(
                            update.getMessage().getText(),
                            currencyRertrievalService.getCurrencyRates()
                    )
            );

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}

