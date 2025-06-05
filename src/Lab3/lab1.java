package Lab3;

import java.util.Scanner;

public class lab1 {
    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Not Prime!!");
                return;
            }
        }
        System.out.println("Prime !");
    }

    public static void main(String[] args) {
        checkPrime();
    }
}
