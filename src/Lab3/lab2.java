package Lab3;

import java.util.Scanner;

public class lab2 {
    public static void printBangCuuChuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", a, i, a * i);
        }
    }

    public static void main(String[] args) {
        printBangCuuChuong();
    }
}
