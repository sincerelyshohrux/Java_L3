import java.util.ArrayList;

class UniversityLab {

    public static void main(String[] args) {

        Professor prof1 = new Professor(101, "Dr. Aziz Karimov", "Computer Science");
        Professor prof2 = new Professor(102, "Dr. Sarah Johnson", "Information & Communication Engineering");

        Student stu1 = new Student(201, "Javlon Rustamov", 3.8);
        Student stu2 = new Student(202, "Malika Yusupova", 3.5);
        Student stu3 = new Student(203, "Sardor Tashkentov", 3.9);
        Student stu4 = new Student(204, "Dilnoza Karimova", 3.2);

        Staff staff1 = new Staff(301, "Nodira Azimova", "Admin Assistant");

        Course course1 = new Course("SOC2030", "Application Programming in Java", prof1);
        Course course2 = new Course("CSE1010", "Introduction to Programming", prof2);

        course1.enrollStudent(stu1);
        course1.enrollStudent(stu2);
        course2.enrollStudent(stu3);
        course2.enrollStudent(stu4);

        course1.printClassList();
        course2.printClassList();

        ArrayList<CommunityMember> allMembers = new ArrayList<>();
        allMembers.add(prof1);
        allMembers.add(prof2);
        allMembers.add(stu1);
        allMembers.add(stu2);
        allMembers.add(stu3);
        allMembers.add(stu4);
        allMembers.add(staff1);

        System.out.println("\n--- All Community Members (Polymorphic Loop) ---");
        for (CommunityMember member : allMembers) {
            System.out.println(member.toString() + " | Role: " + member.getRole());
        }
    }
}