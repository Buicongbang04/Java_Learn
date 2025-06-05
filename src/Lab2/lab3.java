package Lab2;

import java.util.Scanner;

public class lab3 {
    void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        int n = sc.nextInt();
        if (n < 100) {
            System.out.println("Tien dien la: " + (n * 1000));
        } else {
            System.out.println("Tien dien la: " + (n + 1500));
        }
    }
}
