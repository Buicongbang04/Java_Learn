package Lab1;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        int width = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();

        System.out.println("Chu vi: " + ((width + height) * 2));
        System.out.println("Dien tich: " + (height * width));
        System.out.println("Canh nho hon: " + Math.min(width, height));
    }
}
