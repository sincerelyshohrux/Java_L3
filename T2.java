import java.util.ArrayList;

/* =========================================================
 * TASK 2: Implement Aggregation (HAS-A Relationship)
 * TASK 4: Method Overloading (Static Polymorphism)
 * =========================================================
 * Course HAS-A Professor (instructor) and HAS-MANY Students.
 * These objects are created OUTSIDE this class and simply
 * passed in -> that is what makes this "aggregation".
 *
 * The two enrollStudent() methods below (one Student vs. a whole
 * ArrayList<Student>) are the TASK 4 method-overloading requirement.
 */
class Course {

    private String courseCode;
    private String courseName;
    private Professor instructor;                 // HAS-A Professor
    private ArrayList<Student> enrolledStudents;   // HAS-MANY Students

    public Course(String courseCode, String courseName, Professor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    // Accessors / Mutators
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

    /**
     * TASK 4 - Overload #1: enroll ONE student.
     */
    public void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    /**
     * TASK 4 - Overload #2: enroll a WHOLE LIST of students at once.
     * Same method name, different parameter type = Method Overloading
     * (resolved at COMPILE time, hence "static polymorphism").
     */
    public void enrollStudent(ArrayList<Student> studentList) {
        enrolledStudents.addAll(studentList);
    }

    /**
     * TASK 2 - Prints the course info and the class list.
     * Calling s.toString() here triggers RUNTIME polymorphism: the JVM
     * looks at the actual object (Student) and runs ITS toString(),
     * not some generic version. This is dynamic method dispatch.
     */
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