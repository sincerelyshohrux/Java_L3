abstract class CommunityMember {

    private int id;
    private String name;
    {
        System.out.println("A new community member is being created...");
    }

    public CommunityMember(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Student extends CommunityMember {

    private double gpa;

    public Student(int id, String name, double gpa) {
        super(id, name);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + gpa;
    }
}

class Professor extends CommunityMember {

    private String department;

    public Professor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

class Staff extends CommunityMember {

    private String title;

    public Staff(int id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title;
    }
}