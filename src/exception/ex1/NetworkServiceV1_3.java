package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가, 네트워크 연결 전 입력 값 검증

        // 오류 메세지 로그 추가
        // 연결 오류 발생 시, 전송 오류 발생 시 케이스 분리 -> 마지막에 무조건 disconnect() 가 호출되게 변경
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();
    }

    // if문 내에 결과가 성공이 아니다 (!connectResult.equals("success")) 라는 코드보다,
    // 오류면 -> 오류코드 출력해라 라는 것이 더 이해가 쉽다.
    // 때문에 기존 조건문을 메서드로 만들어서 관리
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
