package miniproject;
import java.util.ArrayList;
import java.util.List;

public class LoanDAO {

    private List<Loan> loans = new ArrayList<>();
    private int idCounter = 1;

    public void checkEligibility(String name, int age, double income,
                                 int creditScore, double loanAmount, int months) {

        String status;
        double maxLoan = 0;

        if (age >= 21 && income >= 20000 && creditScore >= 650) {
            status = "Eligible";
            maxLoan = income * 10;
        } else {
            status = "Not Eligible";
        }

        double emi = loanAmount / months;

        Loan loan = new Loan(idCounter++, name, age, income, creditScore,
                loanAmount, months, emi, maxLoan, status);

        loans.add(loan);

        // Summary Report
        System.out.println("\n--- Summary Report ---");
        System.out.println("Eligibility Result: " + status);
        System.out.println("Maximum Loan Amount: " + maxLoan);
        System.out.println("Monthly EMI: " + emi);
    }

    public List<Loan> getAllLoans() {
        return loans;
    }

    public boolean updateLoan(int id, double income, int creditScore,
                              double loanAmount, int months) {

        for (Loan loan : loans) {
            if (loan.getId() == id) {

                String status;
                double maxLoan = 0;

                if (income >= 20000 && creditScore >= 650) {
                    status = "Eligible";
                    maxLoan = income * 10;
                } else {
                    status = "Not Eligible";
                }

                double emi = loanAmount / months;

                loan.update(income, creditScore, loanAmount,
                        months, emi, maxLoan, status);
                return true;
            }
        }
        return false;
    }

    public boolean deleteLoan(int id) {
        return loans.removeIf(l -> l.getId() == id);
    }
}


