package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateAndTime {
    public void testLocaldateAndTime() {
        LocalDate date = LocalDate.now();
        System.out.println("current date: " + date);

        LocalDate lastDay = date.plusDays(4);
        System.out.println("Last day: " + lastDay);

        if (date.isBefore(lastDay)) {
            System.out.println("days left: " + date.datesUntil(lastDay).count());
        }
        System.out.println("Year: " + date.getYear());

        LocalTime localTime = LocalTime.now();
        System.out.println("current time: " + localTime);
        System.out.println("minutes: " + localTime.getMinute());
        System.out.println("hours: " + localTime.getHour());

    }
}
