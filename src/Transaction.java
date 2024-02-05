import java.util.Random;

public class Transaction implements Runnable {
    private BankAccount bankAccount;
    private boolean depositOperation;

    public Transaction(BankAccount bankAccount, boolean depositOperation) {
        this.bankAccount = bankAccount;
        this.depositOperation = depositOperation;
    }

    @Override
    public void run() {
        Random random = new Random();
        double amount = random.nextDouble() * 100;
        if (depositOperation) {
            bankAccount.deposit(amount);
        } else {
            bankAccount.withdraw(amount);
        }
    }
}
