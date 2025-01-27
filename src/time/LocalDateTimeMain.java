package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 시간 = " + nowDt);
        System.out.println("지정 시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변)
        LocalDateTime ofTimePlus = ofDt.plusDays(10);
        System.out.println("지정 날짜시간 + 1000d = " + ofTimePlus);
        LocalDateTime ofTimePlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간 + 1년 = " + ofTimePlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt)); // false
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isAfter(ofDt)); // true
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? " + nowDt.isEqual(ofDt)); // false
    }
}
