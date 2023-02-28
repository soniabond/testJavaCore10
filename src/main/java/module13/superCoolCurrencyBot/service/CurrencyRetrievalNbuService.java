package module13.superCoolCurrencyBot.service;

import static module13.superCoolCurrencyBot.utils.CurrencyCodes.CODES_CURRENCY;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import module13.superCoolCurrencyBot.dto.CurrencyRateDto;
import module13.superCoolCurrencyBot.dto.CurrencyRateNbuResponseDto;
import module13.superCoolCurrencyBot.enums.BankName;
import module13.superCoolCurrencyBot.utils.JsonConverter;
import org.jsoup.Jsoup;

public class CurrencyRetrievalNbuService implements CurrencyRetrievalService {

  private static final String URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

  @Override
  public List<CurrencyRateDto> getCurrencyRates() {
    try {
      String response = Jsoup.connect(URL).ignoreContentType(true).get().body().text();
      List<CurrencyRateNbuResponseDto> currencyRateResponses = JsonConverter.convertResponseToList(
          response, CurrencyRateNbuResponseDto.class);
      return currencyRateResponses.stream()
          .filter(item -> CODES_CURRENCY.containsKey(item.getR030()))
          .map(item -> new CurrencyRateDto(
                  CODES_CURRENCY.get(item.getR030()),
                  item.getRate(),
                  item.getRate(),
                  BankName.NBU,
                  false
              )
          )
          .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
