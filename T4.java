import java.util.ArrayList;


class OverloadingDemo {

    public static void main(String[] args) {

        Professor prof = new Professor(103, "Dr. Elyor Nazarov", "Software Engineering");
        Course course = new Course("SWE2050", "Data Structures", prof);

        Student s1 = new Student(211, "Kamola Rashidova", 3.6);
        Student s2 = new Student(212, "Otabek Yoldoshev", 3.4);
        Student s3 = new Student(213, "Zarina Bekova", 3.9);

        System.out.println(">> Calling enrollStudent(Student s) for ONE student:");
        course.enrollStudent(s1);
        System.out.println(">> Calling enrollStudent(ArrayList<Student> list) for MULTIPLE students:");
        ArrayList<Student> moreStudents = new ArrayList<>();
        moreStudents.add(s2);
        moreStudents.add(s3);
        course.enrollStudent(moreStudents);

        course.printClassList();
    }
}