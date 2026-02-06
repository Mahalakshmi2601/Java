package Looping;
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Odd: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nEven: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}

