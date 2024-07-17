package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        /**
         * try 에서 객체 생성
         * 그 아래에서 init 을 비롯한 메서드 실행
         */
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data); // 추가, 네트워크 연결 전 입력 값 검증
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
