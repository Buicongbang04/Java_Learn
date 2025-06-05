package Lab2;

import java.util.Scanner;

public class lab2 {
    public static void phuongTrinhBac2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cho phuong trinh: ax^2 + bx + c = 0");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem !!!");
            } else if (b == 0) {
                System.out.println("Phuong trinh vo nghiem !!!");
            } else {
                System.out.println("Nghiem cua phuong trinh la: " + ((-c) / b));
            }
        } else {
            int delta = (int) Math.pow(b, 2) - 4 * a * c;
            if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: " + (-b / (2 * a)));
            } else if (delta < 0) {
                System.out.println("Phuong trinh vo so nghiem !!!");
            } else {
                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("x1 = " + (-b + (Math.sqrt(delta) / (2 * a))));
                System.out.println("x2 = " + (-b - (Math.sqrt(delta) / (2 * a))));
            }
        }
    }
}
