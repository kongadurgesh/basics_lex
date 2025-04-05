package entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTimeTest {
    public void testZoneTime() {
        LocalDateTime indiaTime = LocalDateTime.of(2016, 11, 30, 18, 30, 0);

        ZonedDateTime usTime = ZonedDateTime.of(indiaTime, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));

        System.out.println("India Time: " + ZonedDateTime.of(indiaTime, ZoneId.of(ZoneId.SHORT_IDS.get("IST"))));

        System.out.println("US Time: " + usTime);

        ZonedDateTime cstDateTime = ZonedDateTime.of(indiaTime, ZoneId.of(ZoneId.SHORT_IDS.get("CST")));

        System.out.println("CST Time: " + cstDateTime);

        ZonedDateTime ukDateTime = ZonedDateTime.of(indiaTime, ZoneId.of(ZoneId.SHORT_IDS.get("ECT")));

        System.out.println("UK Time: " + ukDateTime);

        ZonedDateTime auDateTime = ZonedDateTime.of(indiaTime, ZoneId.of(ZoneId.SHORT_IDS.get("ACT")));

        System.out.println("Australia Time: " + auDateTime);
    }
}
