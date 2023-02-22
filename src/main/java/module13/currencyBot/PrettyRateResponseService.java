package module13.currencyBot;

import java.util.List;
import java.util.stream.Collectors;

public class PrettyRateResponseService {
    private static String RESPONSE_TEMPLATE = "Для валюти cur курс rate.\n";
    public static String formRateResponse(String command, List<CurrencyRateDto> rates) {
        command = command.toUpperCase();
        String res;
        switch (command) {
            case "BUY": {
                res = rates.stream()
                        .map(item -> RESPONSE_TEMPLATE.replace("cur", item.getCurrency().toString())
                                .replace("rate", item.getBuyRate().toString()))
                        .collect(Collectors.joining());
            } break;
            case "SELL": {
                res =  rates.stream()
                        .map(item -> RESPONSE_TEMPLATE.replace("cur", item.getCurrency().toString())
                                .replace("rate", item.getSellRate().toString()))
                        .collect(Collectors.joining());
            } break;
            default: {
                res = "Доступні команди лише BUY фбо SELL";
            }
        }
        return res;
    }
}
