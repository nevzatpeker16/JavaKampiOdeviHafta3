public class Instructor extends User{
    public int courseID;
    public String courseName;

    public Instructor(int courseID, String courseName) {

        this.courseID = courseID;
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
