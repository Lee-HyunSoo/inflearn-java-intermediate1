package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms"); //325ms, 0.3초


        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L; // 래퍼 클래스 사용 시 L 붙여야함
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms"); //1477ms, 1.4~5초
    }
}
