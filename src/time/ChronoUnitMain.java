package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("HOURS = " + ChronoUnit.HOURS); // Hours
        System.out.println("HOURS.duration.seconds = " + ChronoUnit.HOURS.getDuration().getSeconds()); // 3600
        System.out.println("DAYS = " + ChronoUnit.DAYS); // Days
        System.out.println("DAYS.duration.seconds = " + ChronoUnit.DAYS.getDuration().getSeconds()); // 86400

        // 차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondsBetween = " + secondsBetween); // 600 (10분)

        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("minutesBetween = " + minutesBetween); // 10
    }
}
