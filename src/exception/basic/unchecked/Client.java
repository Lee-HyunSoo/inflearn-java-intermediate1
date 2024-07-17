package exception.basic.unchecked;

public class Client {

    /**
     * Unchecked Exception 은 throws 가 없어도 된다.
     * 참고로 언체크 예외도 throws 예외 를 선언해도 된다. 물론 생략할 수 있다.
     * 언체크 예외는 주로 생략하지만, 중요한 예외의 경우 이렇게 선언해두면,
     * 해당 코드를 호출하는 개발자가 이런 예 외가 발생한다는 점을 IDE를 통해 좀 더 편리하게 인지할 수 있다.
     * (언체크 예외를 던진다고 선언한다고 해서 체크 예외 처럼 컴파일러를 통해서 체크할 수 있는 것은 아니다.
     * 해당 메서드를 호출하는 개발자가 IDE를 통해 호출 코드를 보고, 이런 예외가 발생한다고 인지할 수 있는 정도이다.)
     */
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
