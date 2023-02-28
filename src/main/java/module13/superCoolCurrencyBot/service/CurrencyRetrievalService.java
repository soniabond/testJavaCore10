package module13.superCoolCurrencyBot.service;

import module13.superCoolCurrencyBot.dto.CurrencyRateDto;

import java.util.List;

public interface CurrencyRetrievalService {
    List<CurrencyRateDto> getCurrencyRates();
}
