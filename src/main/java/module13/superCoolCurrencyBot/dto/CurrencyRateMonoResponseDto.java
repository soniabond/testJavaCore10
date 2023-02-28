package module13.superCoolCurrencyBot.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyRateMonoResponseDto {
    private Integer currencyCodeA;
    private Integer currencyCodeB;
    private BigDecimal rateBuy;
    private BigDecimal rateSell;
}
