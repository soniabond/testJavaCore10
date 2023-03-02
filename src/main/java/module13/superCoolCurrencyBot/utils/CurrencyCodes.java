package module13.superCoolCurrencyBot.utils;

import static module13.superCoolCurrencyBot.enums.Currency.EUR;
import static module13.superCoolCurrencyBot.enums.Currency.UAH;
import static module13.superCoolCurrencyBot.enums.Currency.USD;

import java.util.Map;
import module13.superCoolCurrencyBot.enums.Currency;

public class CurrencyCodes {

  private CurrencyCodes() {
  }

  public static final Map<Integer, Currency> CODES_CURRENCY = Map.of(
      980, UAH,
      840, USD,
      978, EUR
  );

  public static final int UAH_CODE = 980;
}
