package exception.basic.checked;

public class Client {

    // call 호출 시 예외가 발생한다 가정
    public void call() throws MyCheckedException {
        // 문제 상황
        // 예외 객체 생성, 생성한 예외를 잡아서 처리하거나 던져야한다.
        // 밖으로 던지게 되면 더이상 코드가 진행되지 않고, call()을 호출한 곳으로 돌아간다.
        throw new MyCheckedException("ex");
    }
}
