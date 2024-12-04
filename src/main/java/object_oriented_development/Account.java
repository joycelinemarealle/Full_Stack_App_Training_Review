package object_oriented_development;

public class Account {
    String name;
    Double balance;


    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;

    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}