import java.util.ArrayList;

class Course {

    private String courseCode;
    private String courseName;
    private Professor instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String courseName, Professor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }


    public void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    public void enrollStudent(ArrayList<Student> studentList) {
        enrolledStudents.addAll(studentList);
    }

    public void printClassList() {
        System.out.println("=======================================");
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor  : " + instructor.getName());
        System.out.println("Enrolled Students:");

        if (enrolledStudents.isEmpty()) {
            System.out.println("  (no students enrolled yet)");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println("  - " + s.toString());
            }
        }
        System.out.println("=======================================");
    }
}