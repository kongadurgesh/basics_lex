package entity;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class TimeZoneTest {
    public void calculateTimes() {
        ZonedDateTime departureDateTime = ZonedDateTime.of(2016, 11, 30, 21, 30, 0, 0,
                ZoneId.of(ZoneId.SHORT_IDS.get("IST")));
        System.out.println("Departure Time in IST- " + departureDateTime);

        ZonedDateTime arrivalTime = ZonedDateTime.of(2016, 12, 1, 06, 0, 0, 0, ZoneId.of(ZoneId.SHORT_IDS.get("IST")));

        System.out.println("Arrival Time in IST- " + arrivalTime);

        System.out.println("Enter your Time Zone");

        Scanner inp = new Scanner(System.in);

        String timeZone = inp.nextLine();
        ZonedDateTime customDepDateTime = departureDateTime
                .withZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get(timeZone)));

        System.out.println(timeZone + " Departure time: " + customDepDateTime);

        ZonedDateTime customArrivalDateTime = arrivalTime
                .withZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get(timeZone)));

        System.out.println(timeZone + " Departure time: " + customArrivalDateTime);
        inp.close();
    }
}
