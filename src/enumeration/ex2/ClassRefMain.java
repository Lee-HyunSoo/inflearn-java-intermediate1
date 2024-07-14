package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        //class enumeration.ex2.ClassGrade
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        //class enumeration.ex2.ClassGrade
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        //class enumeration.ex2.ClassGrade
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        //enumeration.ex2.ClassGrade@30f39991
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        //enumeration.ex2.ClassGrade@452b3a41
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        //enumeration.ex2.ClassGrade@4a574795
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
