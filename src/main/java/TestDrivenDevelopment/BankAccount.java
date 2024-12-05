package TestDrivenDevelopment;

public class BankAccount {
    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    private int balance;
    private String name;

    public int withdraw(int amount) {
        balance -= amount;
        return amount;
    }

    public int deposit(int amount) {
        balance += amount;
        return amount;
    }

    public boolean transfer(BankAccount receiver, int amount) {
        int toTransfer = this.withdraw(amount);
        receiver.deposit(toTransfer);
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }


}