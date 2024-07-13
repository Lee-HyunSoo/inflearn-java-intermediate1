package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentNano = " + currentTimeNano);

        // 환경변수를 읽는다. (운영체제가 사용하는 것)
        Map<String, String> getenv = System.getenv();
        for (String env : getenv.keySet()) {
            System.out.println("env = " + env);
        }

        // 시스템 속성을 읽는다. (자바가 사용하는 시스템의 환경 -> 인코딩은 뭐고, 자바 버전은 뭐고 ...)
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다. (for문으로 복사하면 느림)
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        // 운영체제나 시스템 레벨에 배열을 던져서, 하드웨어 레벨에서 배열을 통채로 복사함 (우리는 루프를 돌려야함) -> 최소 2~5배 빠름
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
