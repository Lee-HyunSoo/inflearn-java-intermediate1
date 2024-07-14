package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault(); // 운영체제가 사용하는 시간 기준
        System.out.println("ZoneId.systemDefault = " + zoneId); // Asia/Seoul

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
