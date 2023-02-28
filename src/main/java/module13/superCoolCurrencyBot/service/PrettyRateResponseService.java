package module13.superCoolCurrencyBot.service;

import module13.superCoolCurrencyBot.dto.CurrencyRateDto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrettyRateResponseService {
    private static String ALL_RATES_RESPONSE_TEMPLATE = "Банк bank: Для валюти cur курс rate.\n";
    private static String BEST_RATE_RESPONSE = "Operation: банк bank курс rate\n";
    public static String formAllRateResponse(String command, List<CurrencyRateDto> rates) {
        command = command.toUpperCase();
        String res;
        switch (command) {
            case "BUY": {
                res = rates.stream()
                        .map(item -> ALL_RATES_RESPONSE_TEMPLATE.replace("cur", item.getCurrency().toString())
                                .replace("rate", item.getBuyRate().toString())
                                // тепер додаю з якого ресурсу (банку) взят курс
                                .replace("bank", item.getBankName().toString()))
                        .collect(Collectors.joining());
            } break;
            case "SELL": {
                res =  rates.stream()
                        .map(item -> ALL_RATES_RESPONSE_TEMPLATE.replace("cur", item.getCurrency().toString())
                                .replace("rate", item.getSellRate().toString())
                                .replace("bank", item.getBankName().toString()))
                        .collect(Collectors.joining());
            } break;
            default: {
                res = "Доступні команди лише BUY, SELL, USD, EUR!";
            }
        }
        return res;
    }

    public static String formBestRateResponse(Map<String, CurrencyRateDto> rates) {
        CurrencyRateDto sell = rates.get("sell");
        String sellLine = BEST_RATE_RESPONSE.replace("Operation", "SELL")
                .replace("bank", sell.getBankName().toString())
                .replace("rate", sell.getSellRate().toString());
        CurrencyRateDto buy = rates.get("buy");
        String buyLine = BEST_RATE_RESPONSE.replace("Operation", "BUY")
                .replace("bank", buy.getBankName().toString())
                .replace("rate", buy.getBuyRate().toString());
        return sellLine + buyLine;
    }
}
