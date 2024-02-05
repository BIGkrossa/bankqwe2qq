public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнение: +" + amount + ", Баланс: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + ", Баланс: " + balance);
        } else {
            System.out.println("Не хватает!");
        }
    }
}