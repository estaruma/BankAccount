// create an abstract class BankAccount

abstract class BankAccount {
    protected  double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // abstract methods deposit() and withdraw()
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

