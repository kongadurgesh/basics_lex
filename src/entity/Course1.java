package entity;

class Course1 {
    String courseName;
    int courseId;

    public Course1(int courseId, String courseName) {
        super();
        this.courseName = courseName;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseId=" + courseId + "]";
    }

}