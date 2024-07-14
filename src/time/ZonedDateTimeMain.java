package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt); // 2024-07-14T11:09:56.546391+09:00[Asia/Seoul]

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        // LocalDateTime 기반으로 ZonedDateTime 만들 수 있음
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1); // 2030-01-01T13:30:50+09:00[Asia/Seoul]

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50,
                0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2); // 2030-01-01T13:30:50+09:00[Asia/Seoul]

        // utc 는 서울이랑 9시간 차이 -- 13:30:50 -> 04:30:50 됨
        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt); // 2030-01-01T04:30:50Z[UTC]
    }
}
