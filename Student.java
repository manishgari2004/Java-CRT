public class Student {
    private int rollNo;
    private String name;
    private int age;
    private double cgpa;
    private Department department;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, double cgpa, Department department) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
               "rollNo=" + rollNo +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", cgpa=" + cgpa +
               ", department=" + department +
               '}';
    }

    public static void main(String[] args) {
        Department dept = new Department("Computer Science");
        Student student = new Student(101, "John Doe", 20, 3.5, dept);
        System.out.println(student);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}