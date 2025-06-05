package Lab2;

import java.util.Scanner;

public class lab1 {
    public void phuongTrinhBac1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cho phuong trinh: ax + b = 0");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem !!!");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem !!!");
        } else {
            System.out.println("Nghiem cua phuong trinh la: " + ((-b) / a));
        }
    }
}
