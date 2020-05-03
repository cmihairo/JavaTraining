package problem5;

public class SavingsAccountTest {
    public static void main(String[]args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.4);
        double interest1 =  saver1.calculateMonthlyInterest();
        double interest2 =  saver2.calculateMonthlyInterest();
        System.out.println("The balance for saver1 is: " + interest1);
        System.out.println("The balance for saver2 is: " + interest2);

        saver1.setSavingsBalance(interest1);
        saver2.setSavingsBalance(interest2);

        SavingsAccount.modifyInterestRate(0.5);
        System.out.println("The balance for saver1 is: " + saver1.calculateMonthlyInterest());
        System.out.println("The balance for saver2 is: " + saver2.calculateMonthlyInterest());


    }
}
