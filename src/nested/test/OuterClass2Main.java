package nested.test;

public class OuterClass2Main {

    // 여기에서 InnerClass의 hello() 메서드를 호출하라.
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
