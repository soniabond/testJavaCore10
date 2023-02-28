package module13.superCoolCurrencyBot.service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import module13.superCoolCurrencyBot.dto.CurrencyRateDto;
import module13.superCoolCurrencyBot.dto.CurrencyRatePrivatResponseDto;
import module13.superCoolCurrencyBot.enums.BankName;
import module13.superCoolCurrencyBot.utils.JsonConverter;
import org.jsoup.Jsoup;

public class CurrencyRetrievalPrivatService implements CurrencyRetrievalService {

  private static final String URL = "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=11";

  @Override
  public List<CurrencyRateDto> getCurrencyRates() {
    try {
      String response = Jsoup.connect(URL).ignoreContentType(true).get().body().text();
      List<CurrencyRatePrivatResponseDto> responseDtos = JsonConverter.convertResponseToList(
          response, CurrencyRatePrivatResponseDto.class);
      return responseDtos.stream()
          // тепер додаю назву банку щоб потім зрозуміті курс якого банку був найвигіднішим
          .map(dto -> new CurrencyRateDto(dto.getCcy(), dto.getBuy(), dto.getSale(),
              BankName.PRIVATBANK))
          .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
