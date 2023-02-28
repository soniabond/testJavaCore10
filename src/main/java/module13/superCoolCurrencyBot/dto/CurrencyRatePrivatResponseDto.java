package module13.superCoolCurrencyBot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import module13.superCoolCurrencyBot.enums.Currency;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class CurrencyRatePrivatResponseDto {
    private Currency ccy;
    private Currency base_ccy;
    private BigDecimal buy;
    private BigDecimal sale;
}
