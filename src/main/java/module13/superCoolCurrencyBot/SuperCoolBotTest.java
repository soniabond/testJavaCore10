package module13.superCoolCurrencyBot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class SuperCoolBotTest {
    // бот має відібражати актуальний курc валюс за запитом клієнта
    // при запиті SALE - курс продажу гривні
    // при запиті BUY - курс купівді гривні
    public static void main(String[] args) {
//        CurrencyRertrievalPrivatService currencyRertrievalPrivatService = new CurrencyRertrievalPrivatService();
//        System.out.println("currencyRertrievalService.getCurrencyRates() = " + currencyRertrievalPrivatService.getCurrencyRates());

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new CurrencyBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
