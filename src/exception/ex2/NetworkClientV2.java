package exception.ex2;

public class NetworkClientV2 {

    private final String address; // 접근할 외부 서버의 주소
    public boolean connectError; // true 시 연결 실패
    public boolean sendError; // true 시 연결 실패

    public NetworkClientV2(String address) {
        this.address = address;
    }

    // 외부 서버에 연결한다.
    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    // 연결한 외부 서버에 데이터를 전송한다.
    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            // 중간에 다른 예외가 터졌다고 가정
//            throw new RuntimeException("ex");
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    // 외부 서버와 연결을 해제한다.
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    // connectError, sendError 제어
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}