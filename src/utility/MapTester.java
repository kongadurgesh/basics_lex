package utility;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTester {
    public void testMap() {
        Set<Course> courseSet1 = new HashSet<>();
        courseSet1.add(new Course("Java"));
        courseSet1.add(new Course("DBMS"));

        Set<Course> courseSet2 = new HashSet<>();
        courseSet2.add(new Course("PHP"));
        courseSet2.add(new Course("HTML"));
        courseSet2.add(new Course("CSS"));

        Map<Integer, Set<Course>> studentCourses = new HashMap<>();

        studentCourses.put(1001, courseSet1);
        studentCourses.put(1002, courseSet2);

        Set<Integer> keySet = studentCourses.keySet();
        for (Integer key : keySet) {
            System.out.println(key);
        }

        for (Integer key : keySet) {
            System.out.println(studentCourses.get(key));
        }

        System.out.println("Using Iterator");

        Collection<Set<Course>> courses = studentCourses.values();

        Iterator<Set<Course>> iterator = courses.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void testStudentsMap() {
        Map<Integer, Character> gradesMap = new TreeMap<>();
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("John", 123, 61));
        students.add(new Student("mike", 456, 55));
        students.add(new Student("Sarah", 1253, 34));

        for (Student student : students) {
            Character grade;
            if (student.getTotalMarks() >= 60) {
                grade = 'A';
            } else if (student.getTotalMarks() > 40) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            gradesMap.put(student.getRollNumber(), grade);
        }

        for (Integer rollNumber : gradesMap.keySet()) {
            System.out.println("Roll No: " + rollNumber + " grade: " + gradesMap.get(rollNumber));
        }
    }
}
