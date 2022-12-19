package module7;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentTransaction {
    private final BigDecimal sum;
    private final Date date;

    public PaymentTransaction(BigDecimal sum, Date date) {
        this.sum = sum;
        this.date = (Date) date.clone();
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    @Override
    public String toString() {
        return "PaymentTransaction{" +
                "sum=" + sum +
                ", date=" + date +
                '}';
    }
}
