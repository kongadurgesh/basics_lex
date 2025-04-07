package entity;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course1> {

    @Override
    public int compare(Course1 o1, Course1 o2) {
        return o2.courseId - o1.courseId;
    }

}