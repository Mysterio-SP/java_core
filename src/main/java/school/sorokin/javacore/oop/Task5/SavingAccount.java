package school.sorokin.javacore.oop.Task5;

public class SavingAccount extends Account implements Printable {

    SavingAccount(double balance) {
        super(balance);

    }
    public void withdraw(double amount) {
        double balanceAfterTransaction = balance - amount;

        if(balanceAfterTransaction < 0) {
            System.out.println("Ошибка! В сберегательном счете невозможно уйти в минус");
            return;
        }

        balance = balanceAfterTransaction;
        System.out.println("Остаток баланса равен " + balance);

    }

    @Override
    public void printInfo() {
        System.out.println("Это сберегательный счет.");
    }
}
