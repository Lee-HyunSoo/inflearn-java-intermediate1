package lang.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";
        Integer value = Integer.valueOf(str);
        int unBoxed = value.intValue();
        Integer Boxed = Integer.valueOf(unBoxed);

        System.out.println("value = " + value);
        System.out.println("unBoxed = " + unBoxed);
        System.out.println("Boxed = " + Boxed);
    }
}
