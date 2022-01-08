import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return null;
    }

    public Money calculateMovieFee(Screening screening) {
        if(discountPolicy == null){
            return fee;
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

}
