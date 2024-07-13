package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        // 두개는 같은 것
        Class helloClass = Hello.class;
        Class helloClass1 = Class.forName("lang.clazz.Hello");// 패키지명 쭉 적어줘야함

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello); // lang.clazz.Hello@30f39991
        System.out.println("result = " + result); // hello!
    }
}
