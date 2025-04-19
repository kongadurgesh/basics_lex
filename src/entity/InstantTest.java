package entity;

import java.time.Duration;
import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class InstantTest {
    public void test() {
        Instant i = InstantSource.system().instant();
        System.out.println(i);
    }

    public void test2() {
        LocalDateTime fixed = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        Instant i = InstantSource.fixed(fixed.toInstant(ZoneOffset.UTC)).instant();
        System.out.println(i);
    }

    public void test3() {
        Long m = InstantSource.system().millis();
        System.out.println(m);
    }

    public void test4() {
        Instant currentTime = Instant.now();
        LocalDateTime fixedTime = LocalDateTime.of(2026, 4, 1, 0, 0, 0);
        Instant fixedTimeInstant = InstantSource.fixed(fixedTime.toInstant(ZoneOffset.UTC)).instant();

        long diff = Duration.between(currentTime, fixedTimeInstant).getSeconds();

        System.out.println(diff);

        String compareTo = currentTime.compareTo(fixedTimeInstant) > 0 ? "Future"
                : currentTime.compareTo(fixedTimeInstant) == 0 ? "Same" : "Past";

        System.out.println(compareTo);

    }
}
