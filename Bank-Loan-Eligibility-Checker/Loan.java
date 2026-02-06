package miniproject;
public class Loan {

    private int id;
    private String name;
    private int age;
    private double income;
    private int creditScore;
    private double loanAmount;
    private int months;
    private double emi;
    private double maxLoan;
    private String status;

    public Loan(int id, String name, int age, double income, int creditScore,
                double loanAmount, int months,
                double emi, double maxLoan, String status) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.income = income;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.months = months;
        this.emi = emi;
        this.maxLoan = maxLoan;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void update(double income, int creditScore,
                       double loanAmount, int months,
                       double emi, double maxLoan, String status) {

        this.income = income;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.months = months;
        this.emi = emi;
        this.maxLoan = maxLoan;
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nLoan ID: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nIncome: " + income +
                "\nCredit Score: " + creditScore +
                "\nEligibility: " + status +
                "\nMax Loan Amount: " + maxLoan +
                "\nLoan Amount: " + loanAmount +
                "\nEMI: " + emi +
                "\n----------------------";
    }
}


