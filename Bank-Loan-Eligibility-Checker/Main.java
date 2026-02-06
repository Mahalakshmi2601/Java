package miniproject;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoanDAO loanDAO = new LoanDAO();

        while (true) {
            System.out.println("\n--- Bank Loan Eligibility Checker ---");
            System.out.println("1. Check Loan Eligibility");
            System.out.println("2. View All Loan Records");
            System.out.println("3. Update Loan Details");
            System.out.println("4. Delete Loan Record");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Monthly Income: ");
                    double income = sc.nextDouble();

                    System.out.print("Enter Credit Score: ");
                    int creditScore = sc.nextInt();

                    System.out.print("Enter Loan Amount: ");
                    double loanAmount = sc.nextDouble();

                    System.out.print("Enter Loan Duration (months): ");
                    int months = sc.nextInt();
                    sc.nextLine();

                    loanDAO.checkEligibility(
                            name, age, income, creditScore, loanAmount, months);
                    break;

                case 2:
                    System.out.println("\n--- Loan Records ---");
                    for (Loan l : loanDAO.getAllLoans()) {
                        System.out.println(l);
                    }
                    break;

                case 3:
                    System.out.print("Enter Loan ID to update: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Income: ");
                    double newIncome = sc.nextDouble();

                    System.out.print("Enter New Credit Score: ");
                    int newCreditScore = sc.nextInt();

                    System.out.print("Enter New Loan Amount: ");
                    double newLoanAmount = sc.nextDouble();

                    System.out.print("Enter New Duration (months): ");
                    int newMonths = sc.nextInt();
                    sc.nextLine();

                    if (loanDAO.updateLoan(updateId, newIncome, newCreditScore, newLoanAmount, newMonths)) {
                        System.out.println("Loan details updated.");
                    } else {
                        System.out.println("Loan record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Loan ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();

                    if (loanDAO.deleteLoan(deleteId)) {
                        System.out.println("Loan record deleted.");
                    } else {
                        System.out.println("Loan record not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
