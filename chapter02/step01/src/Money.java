import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);

    // BigDecimal은 Java 언어에서 숫자를 정밀하게 저장하고 표현할 수 있는 유일한 방법이다.
    private final BigDecimal amount;

    public static Money wons(long amount){
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount){
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money amount){
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount){
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent){
        return new Money(this.amount.multiply(
                BigDecimal.valueOf(percent)
        ));
    }

    public boolean isLessThan(Money other){
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other){
        return amount.compareTo(other.amount) >= 0;
    }
}
