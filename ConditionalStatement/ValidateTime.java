package Conditionalstatement;
import java.util.Scanner;

public class ValidateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next(); // format HH:MM
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);

        if (hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59)
            System.out.println("Valid Time");
        else
            System.out.println("Invalid Time");
    }
}

