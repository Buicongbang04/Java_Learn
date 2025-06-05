package Lab1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();


        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        sc.close();
    }
}
