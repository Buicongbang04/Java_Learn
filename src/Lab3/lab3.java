package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {
    public static void createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("Enter element " + (j + 1));
            arr[j] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        System.out.printf("Min: %d%n", arr[0]);
        System.out.printf("Max: %d%n", arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        createArray();
    }
}
