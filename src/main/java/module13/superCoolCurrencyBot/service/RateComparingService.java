package module13.superCoolCurrencyBot.service;

import module13.superCoolCurrencyBot.dto.CurrencyRateDto;
import module13.superCoolCurrencyBot.enums.Currency;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RateComparingService {
    // список всіх сервісів які вміють діставати курси.
    private List<CurrencyRetrievalService> retrievalServices = List.of(
            new CurrencyRetrievalMonoService(),
            new CurrencyRetrievalPrivatService()
    );

    // відповідь буде мапа формату
    // {"sell": currencyRateDto, "buy": currencyRateDto}
    public Map<String, CurrencyRateDto> getBestRates(Currency currency) {
        List<CurrencyRateDto> rates = getActualRates().stream()
                // залишити тільки потрібну валюту
                .filter(item -> currency.equals(item.getCurrency()))
                .collect(Collectors.toList());

        // отримання курсу купівлі: (найбільший = найкращій)
        CurrencyRateDto buyRate = rates.stream()
                .max(Comparator.comparing(CurrencyRateDto::getBuyRate))
                .get();

        // отримання курсу продажу: (найменший = найкращій)
        CurrencyRateDto sellRate = rates.stream()
                .min(Comparator.comparing(CurrencyRateDto::getSellRate))
                .get();

        // збираю мапу відповідей
        return Map.of(
                "buy", buyRate,
                "sell", sellRate
        );
    }

    private List<CurrencyRateDto> getActualRates(){
        return retrievalServices.stream()
                .map(CurrencyRetrievalService::getCurrencyRates)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
