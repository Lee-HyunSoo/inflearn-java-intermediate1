package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price) {
        int discountPrice = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPrice = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPrice = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPrice = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return price * discountPrice / 100;
    }
}
