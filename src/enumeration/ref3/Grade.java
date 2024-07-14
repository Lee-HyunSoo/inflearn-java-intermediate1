package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public int discount(int price) {
        return this.discountPercent * price / 100;
    }
}
