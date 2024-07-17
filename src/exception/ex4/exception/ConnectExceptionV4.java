package exception.ex4.exception;

/**
 * 연결 실패 시 발생하는 예외
 * 내부에 연결을 시도한 address 를 보관한다.
 */
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address; // 어느 서버의 연결에 실패했는지

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
