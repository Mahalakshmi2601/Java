package Conditionalstatement;
import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next(); // input format dd/mm/yyyy
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        boolean isValid = true;

        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            int maxDays;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    maxDays = 31; break;
                case 4: case 6: case 9: case 11:
                    maxDays = 30; break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                        maxDays = 29;
                    else
                        maxDays = 28;
                    break;
                default: maxDays = 0;
            }
            if (day < 1 || day > maxDays)
                isValid = false;
        }

        System.out.println(isValid ? "Valid Date" : "Invalid Date");
    }
}
