package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     * 예외를 잡아서 처리하려면 `try ~ catch(..)` 를 사용해서 예외를 잡으면 된다.
     * `try` 코드 블럭에서 발생하는 예외를 잡아서 `catch` 로 넘긴다.
     * 만약 `try` 에서 잡은 예외가 `catch` 의 대상에 없으면 예외를 잡을 수 없다.
     * 이때는 예외를 밖으로 던져야 한다.
     * 여기서는 `MyCheckedException` 예외를 `catch` 로 잡아서 처리한다.
     */
    public void callCatch() {
        try { // Client.call() 에서 날아온 폭탄을 잡으려는 시도
            client.call();
            System.out.println("test"); // 실행되지 않는다. call -> catch -> 정상흐름 출력으로 가기 때문
        } catch (MyCheckedException e) { // 폭탄을 잡음
            // 예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage()); // Exception 에 보관한 메세지 가져옴
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
