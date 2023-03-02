package module13.superCoolCurrencyBot.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import module13.superCoolCurrencyBot.dto.CurrencyRateDto;
import module13.superCoolCurrencyBot.enums.BankName;
import module13.superCoolCurrencyBot.enums.Currency;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CurrencyRetrievalOschadService implements CurrencyRetrievalService {

  private static final String URL = "https://www.oschadbank.ua/";

  @Override
  public List<CurrencyRateDto> getCurrencyRates() {

    List<CurrencyRateDto> res = new ArrayList<>();
    try {
      Document document = Jsoup.connect(URL).get();
      Elements elements = document.select(".currency header__currency, .currency__item");
      res.add(createCurrencyRateDto(elements.get(0).text()));
      res.add(createCurrencyRateDto(elements.get(1).text()));
      return res;
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  private CurrencyRateDto createCurrencyRateDto(String rateString) {
    String[] rates = rateString.split(" ");
    Currency currency = Currency.valueOf(rates[0]);
    BigDecimal buy = BigDecimal.valueOf(Double.parseDouble(rates[1]));
    BigDecimal sell = BigDecimal.valueOf(Double.parseDouble(rates[2]));
    return new CurrencyRateDto(currency, buy, sell, BankName.OSCHADBANK);
  }
}