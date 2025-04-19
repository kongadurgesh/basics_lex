package entity;

public class RecordPatternTest {
    public void test() {
        User1 user = new User1("King", 35);
        checkRecordMatch(user);
    }

    private void checkRecordMatch(Object user) {
        if (user instanceof User1(String name, int age)) {
            System.out.println("name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public void test2() {
        Address1 address = new Address1("Hyd", 500001);
        User2 user = new User2("KD", 12, address);
        check(user);

    }

    private void check(Object user) {
        if (user instanceof User2(String name, int age, Address1(String city, int postalCode))) {
            System.out.println("city:" + city);
            System.out.println("Postal Code:" + postalCode);
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
        }
    }

    public void test3() {
        Point1 point = new Point1(1, 2);
        Color color = Color.BLUE;
        ColoredPoint coloredPoint = new ColoredPoint(point, color);
        checkPoint(coloredPoint);
    }

    private void checkPoint(Object point) {
        if (point instanceof ColoredPoint(Point1 p, Color c)) {
            System.out.println("Point: " + p.x() + ", " + p.y());
            System.out.println("Color: " + c);
        }
    }
}

record User1(String name, int age) {
}

record Address1(String city, int postalCode) {
}

record User2(String name, int age, Address1 address1) {
}

record Point1(int x, int y) {
}

record ColoredPoint(Point1 p, Color c) {
}

enum Color {
    RED, BLUE, WHITE;
}
