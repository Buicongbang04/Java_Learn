package Lab2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("++------------MENU-------------++");
            System.out.println("| 1. Giải phương trình bậc nhất.|");
            System.out.println("| 2. Giải phương trình bậc hai. |");
            System.out.println("| 3. Tính tiền điện.            |");
            System.out.println("| 4. Exit.                      |");
            System.out.println("++-----------------------------++");

            System.out.println("Enter your choice: ");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    lab1.phuongTrinhBac1();
                    break;
                case 2:
                    lab2.phuongTrinhBac2();
                    break;
                case 3:
                    lab3.tinhTienDien();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
}
