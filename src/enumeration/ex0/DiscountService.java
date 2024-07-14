package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {
        int discountPrice = 0;
        if (grade.equals("BASIC")) {
            discountPrice = 10;
        } else if (grade.equals("GOLD")) {
            discountPrice = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPrice = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return price * discountPrice / 100;
    }
}
