package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가, 네트워크 연결 전 입력 값 검증

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
