package lang.enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPrice = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPrice = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPrice = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인X");
        }
        return discountPrice * price / 100;
    }
}
