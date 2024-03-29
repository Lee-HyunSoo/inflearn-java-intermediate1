package lang.object;

public class Child extends Parent { // 명시적으로 상속을 받았기 때문에 Object 를 상속받지 않는다.

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
