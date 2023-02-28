package module13.superCoolCurrencyBot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import module13.superCoolCurrencyBot.enums.BankName;
import module13.superCoolCurrencyBot.enums.Currency;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyRateDto {
    private Currency currency;
    private BigDecimal buyRate;
    private BigDecimal sellRate;
    private BankName bankName;
}
