package school.sorokin.javacore.oop.Task5;

public class Main {

    public static void main(String[] args) {

//        Account account = new Account();

        Account savindAccount = new SavingAccount(100.50);
        savindAccount.withdraw(100.6);

        Account creditAccount = new CreditAccount(0);
        creditAccount.withdraw(1001);

        Printable p = new CreditAccount(50);
        p.printInfo();
    }
}
