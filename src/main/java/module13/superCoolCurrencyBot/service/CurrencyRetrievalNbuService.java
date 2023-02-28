package module13.superCoolCurrencyBot.service;

import static module13.superCoolCurrencyBot.enums.Currency.EUR;
import static module13.superCoolCurrencyBot.enums.Currency.UAH;
import static module13.superCoolCurrencyBot.enums.Currency.USD;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import module13.superCoolCurrencyBot.dto.CurrencyRateDto;
import module13.superCoolCurrencyBot.dto.CurrencyRateNbuResponseDto;
import module13.superCoolCurrencyBot.enums.BankName;
import module13.superCoolCurrencyBot.enums.Currency;
import org.jsoup.Jsoup;

public class CurrencyRetrievalNbuService implements CurrencyRetrievalService {

  private static final String URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
  private static Map<Integer, Currency> codeCurr = Map.of(
      980, UAH,
      840, USD,
      978, EUR
  );

  @Override
  public List<CurrencyRateDto> getCurrencyRates() {
    try {
      String response = Jsoup.connect(URL).ignoreContentType(true).get().body().text();
      List<CurrencyRateNbuResponseDto> currencyRateResponses = convertResponseToList(response);
      return currencyRateResponses.stream()
          .filter(item -> codeCurr.containsKey(item.getR030()))
          .map(item -> new CurrencyRateDto(
                  codeCurr.get(item.getR030()),
                  item.getRate(),
                  item.getRate(),
                  BankName.NBU,
              false
              )
          )
          .collect(Collectors.toList());
    } catch (IOException e) {
      System.out.println(e.toString());
      throw new RuntimeException(e);
    }
  }

  private List<CurrencyRateNbuResponseDto> convertResponseToList(String response) {
    Type type = TypeToken.getParameterized(List.class, CurrencyRateNbuResponseDto.class).getType();
    Gson gson = new Gson();
    return gson.fromJson(response, type);
  }
}
