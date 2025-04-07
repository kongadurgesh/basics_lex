package entity;

import java.util.ArrayList;
import java.util.Collections;

public class CourseTest {
    public void testCourse() {
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course(124, "AngularJS"));
        courseList.add(new Course(120, "Java"));
        courseList.add(new Course(121, "Hibernate"));

        Collections.sort(courseList);
        System.out.println(courseList);
    }

    public void testComparator() {
        ArrayList<Course1> courseList = new ArrayList<>();
        courseList.add(new Course1(124, "AngularJS"));
        courseList.add(new Course1(120, "Java"));
        courseList.add(new Course1(121, "Hibernate"));

        Collections.sort(courseList, new CourseComparator());
        System.out.println(courseList);
    }
}
