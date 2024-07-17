package exception.ex4.exception;

/**
 * NetworkClient 에서 발생하는 모든 예외들의 부모
 */
public class NetworkClientExceptionV4 extends RuntimeException {

    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
