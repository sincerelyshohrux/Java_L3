
class SuperDemo {

    public static void main(String[] args) {

        System.out.println("Creating a Student (constructor calls super(id, name))...");
        Student s = new Student(401, "Umida Sobirova", 3.7);
        System.out.println("Result -> " + s.toString());

        System.out.println("\nCreating a Professor (constructor calls super(id, name))...");
        Professor p = new Professor(402, "Dr. Bekzod Yusupov", "Mathematics");
        System.out.println("Result -> " + p.toString());

        System.out.println("\nCreating a Staff member (constructor calls super(id, name))...");
        Staff st = new Staff(403, "Feruza Alimova", "Librarian");
        System.out.println("Result -> " + st.toString());

        System.out.println("\nAll id/name values above came from CommunityMember's fields,");
        System.out.println("proving each subclass constructor correctly used super(id, name).");
    }
}