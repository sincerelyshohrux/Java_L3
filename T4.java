import java.util.ArrayList;

/* =========================================================
 * TASK 4: Method Overloading (Static Polymorphism) - DEMO
 * =========================================================
 * The two overloaded enrollStudent() methods themselves live inside
 * the Course class (see L3_T2.java), since the assignment requires
 * them to be "in your Course class". This file is a focused demo
 * that clearly shows BOTH overloads being called side by side.
 *
 * Run this with:  java OverloadingDemo
 */
class OverloadingDemo {

    public static void main(String[] args) {

        Professor prof = new Professor(103, "Dr. Elyor Nazarov", "Software Engineering");
        Course course = new Course("SWE2050", "Data Structures", prof);

        Student s1 = new Student(211, "Kamola Rashidova", 3.6);
        Student s2 = new Student(212, "Otabek Yoldoshev", 3.4);
        Student s3 = new Student(213, "Zarina Bekova", 3.9);

        // ---- Overload #1: enrollStudent(Student s) ----
        System.out.println(">> Calling enrollStudent(Student s) for ONE student:");
        course.enrollStudent(s1);

        // ---- Overload #2: enrollStudent(ArrayList<Student> studentList) ----
        System.out.println(">> Calling enrollStudent(ArrayList<Student> list) for MULTIPLE students:");
        ArrayList<Student> moreStudents = new ArrayList<>();
        moreStudents.add(s2);
        moreStudents.add(s3);
        course.enrollStudent(moreStudents);

        // Show the final result - all 3 students should be enrolled
        course.printClassList();
    }
}