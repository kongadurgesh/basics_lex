package entity;

public class SwitchTest {
    public void testSwitch(int day) {
        String dayName = switch (day) {
            case 1 -> "Moonday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid Day: " + day;
        };
        System.out.println(dayName);
    }

    public void testYield(int day) {
        String dayName = switch (day) {
            case 1:
                yield "Monday";
            default:
                yield "Invalid Day: " + day;
        };
        System.out.println(dayName);
    }
}
