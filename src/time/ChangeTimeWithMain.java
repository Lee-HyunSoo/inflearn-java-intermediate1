package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt); // 2018-01-01T13:30:59

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020); // 불변일 때 사용하는 with
        System.out.println("changedDt1 = " + changedDt1); // 2020-01-01T13:30:59 (연도만 2020년으로 바꿔서 새 인스턴스 반환)

        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2); // 편의 메서드

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dt); // 2018-01-01T13:30:59
        System.out.println("다음 금요일: " + with1); // 2018-01-05T13:30:59

        // 이번달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일: " + with2); // 2018-01-28T13:30:59
    }
}
