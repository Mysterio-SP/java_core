package school.sorokin.javacore.oop.Task5;

public class CreditAccount extends Account implements Printable {

    CreditAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {

        double balanceAfterTransaction = balance - amount;

        if(balanceAfterTransaction < -1000) {
            System.out.println("Ошибка! Невозможно превысить кредитный лимит более чем на 1000 рублей!");
            return;
        }

        balance = balanceAfterTransaction;
        System.out.println("Остаток баланса равен " + balance);
    }

    @Override
    public void printInfo() {
        System.out.println("Это кредитный счет.");
    }
}
