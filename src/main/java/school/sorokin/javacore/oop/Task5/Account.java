package school.sorokin.javacore.oop.Task5;

public abstract class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amout) {
        this.balance += amout;
    }

    abstract void withdraw(double amount);
}
