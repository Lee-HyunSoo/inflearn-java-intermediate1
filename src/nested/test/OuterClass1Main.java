package nested.test;

public class OuterClass1Main {

    // 여기에서 NestedClass의 hello() 메서드를 호출하라.
    public static void main(String[] args) {
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
