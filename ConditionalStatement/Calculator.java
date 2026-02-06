package Conditionalstatement;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        int result;

        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Division by zero not allowed");
                    return;
                }
                break;
            case '%':
                if (num2 != 0)
                    result = num1 % num2;
                else {
                    System.out.println("Division by zero not allowed");
                    return;
                }
                break;
            default: 
                System.out.println("Invalid Operator"); 
                return;
        }

        System.out.println(result);
    }
}
