public class NoneDiscountPolicy extends DiscountPolicy{
    // 0원 이라는 할인 요금을 계산
    @Override
    protected Money getDiscountAmount(Screening screening){
        return Money.ZERO;
    }
}
