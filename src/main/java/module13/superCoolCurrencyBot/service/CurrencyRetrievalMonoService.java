package module13.superCoolCurrencyBot.service;

import static module13.superCoolCurrencyBot.utils.CurrencyCodes.CODES_CURRENCY;
import static module13.superCoolCurrencyBot.utils.CurrencyCodes.UAH_CODE;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import module13.superCoolCurrencyBot.dto.CurrencyRateDto;
import module13.superCoolCurrencyBot.dto.CurrencyRateMonoResponseDto;
import module13.superCoolCurrencyBot.enums.BankName;
import module13.superCoolCurrencyBot.utils.JsonConverter;
import org.jsoup.Jsoup;

// ще одна імплементація МОНОБАНК
public class CurrencyRetrievalMonoService implements CurrencyRetrievalService {

  private static final String URL = "https://api.monobank.ua/bank/currency";

  @Override
  public List<CurrencyRateDto> getCurrencyRates() {
    try {
      String response = Jsoup.connect(URL).ignoreContentType(true).get().body().text();
      List<CurrencyRateMonoResponseDto> currencyRateResponses = JsonConverter.convertResponseToList(
          response, CurrencyRateMonoResponseDto.class);
      return currencyRateResponses.stream()
          .filter(item -> CODES_CURRENCY.containsKey(item.getCurrencyCodeA())
              && CODES_CURRENCY.containsKey(item.getCurrencyCodeB())
              && item.getCurrencyCodeB().equals(UAH_CODE)
          )
          // тепер додаю назву банку щоб потім зрозуміті курс якого банку був найвигіднішим
          .map(item -> new CurrencyRateDto(
              CODES_CURRENCY.get(item.getCurrencyCodeA()),
              item.getRateBuy(),
              item.getRateSell(),
              BankName.MONOBANK
          ))
          .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
