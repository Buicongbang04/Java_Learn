package OOP;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("bang", 20, 3.5);

        System.out.println("Name: " + st1.getName());
        System.out.println("Age: " + st1.getAge());
        System.out.println("GPA: " + st1.getGpa());
    }
}
