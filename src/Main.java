// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(500.00);
        BankAccount current = new CurrentAccount(500.00);

        savings.deposit(50.00);
        savings.withdraw(100.00);

        current.deposit(100.00);
        current.withdraw(2000.00);
    }
    }
