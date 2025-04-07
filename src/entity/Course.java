package entity;

public class Course implements Comparable<Course> {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
    }

    @Override
    public int compareTo(Course o) {
        return o.courseName.compareTo(this.courseName);
    }

}
