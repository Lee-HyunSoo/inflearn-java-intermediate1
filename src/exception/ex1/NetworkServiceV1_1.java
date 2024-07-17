package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가, 네트워크 연결 전 입력 값 검증
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
