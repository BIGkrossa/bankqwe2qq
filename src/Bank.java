public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        Thread depositThread = new Thread(new Transaction(bankAccount, true));
        Thread withdrawThread = new Thread(new Transaction(bankAccount, false));
        depositThread.start();
        withdrawThread.start();
    }
}
