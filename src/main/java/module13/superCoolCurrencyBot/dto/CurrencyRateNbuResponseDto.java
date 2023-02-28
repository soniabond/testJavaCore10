package module13.superCoolCurrencyBot.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class CurrencyRateNbuResponseDto {
  private Integer r030;
  private String txt;
  private BigDecimal rate;
  private String cc;
  private String exchangedate;
}

