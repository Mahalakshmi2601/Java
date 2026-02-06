package Looping;
import java.util.Scanner;

public class SumOfFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of numbers
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int fact = 1;
            for (int j = 1; j <= num; j++) {
                fact *= j;
            }
            totalSum += fact;
        }

        System.out.println(totalSum);
    }
}
