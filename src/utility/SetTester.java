package utility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTester {
    public void testSet() {
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(12);
        numbers.add(24);
        numbers.add(12);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void testStudentsSet() {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("John", 123, 61));
        students.add(new Student("mike", 456, 55));
        students.add(new Student("Sarah", 123, 34));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
