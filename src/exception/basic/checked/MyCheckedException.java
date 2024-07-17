package exception.basic.checked;

/**
 * 예외 클래스를 만드려면 예외를 상속 받으면 된다.
 * Exception 을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message); // Exception 클래스에 메세지를 보관하는 기능이 있다.
    }
}
