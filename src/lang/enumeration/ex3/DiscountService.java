package lang.enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPrice = 0;

        if (grade == Grade.BASIC) {
            discountPrice = 10;
        } else if (grade == Grade.GOLD) {
            discountPrice = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인X");
        }
        return discountPrice * price / 100;
    }
}
