package problem5;

public class SavingsAccount {
    private static double  annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {

        double monthlyInterest = (savingsBalance *  annualInterestRate) / 12;
        this.savingsBalance = this.savingsBalance + monthlyInterest;
        return savingsBalance;

    }
    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
