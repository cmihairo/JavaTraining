package problem1;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double debitAmount) {
        if (balance < debitAmount) {
            System.out.println("Debit amount exceeded account balance which is " + this.balance);
        } else {
            this.balance = balance - debitAmount;
            System.out.println("Account balance is " + balance);
        }

    }

}
