package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        // 내부 클래스들은 $ 로 구분
        System.out.println("nestedClass = " + nested.getClass()); // class nested.nested.NestedOuter$Nested
    }
}
