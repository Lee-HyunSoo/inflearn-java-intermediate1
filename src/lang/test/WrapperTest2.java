package lang.test;

public class WrapperTest2 {

    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double result = 0;
        for (String s : array) {
            result += Double.parseDouble(s);
        }
        System.out.println("result = " + result);
    }
}
