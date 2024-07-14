package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        // class enumeration.ex3.Grade
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        // class enumeration.ex3.Grade
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        // class enumeration.ex3.Grade
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC)); // 30f39991
        System.out.println("ref GOLD = " + refValue(Grade.GOLD)); // 452b3a41
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND)); // 4a574795
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
