public class Student extends User{
    public int studentID;
    public int classID;
    public String lectureName;

    public Student(int studentID, int classID, String lectureName) {
        super();
        this.studentID = studentID;
        this.classID = classID;
        this.lectureName = lectureName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
}
