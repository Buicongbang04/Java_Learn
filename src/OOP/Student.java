package OOP;

public class Student extends Human {
    double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    // Getter and Setter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
