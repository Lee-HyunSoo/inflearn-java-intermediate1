package lang.math.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";
        Integer value = Integer.valueOf(str);
        int unBoxed = value;
        Integer Boxed = unBoxed;

        System.out.println("value = " + value);
        System.out.println("unBoxed = " + unBoxed);
        System.out.println("Boxed = " + Boxed);
    }
}
