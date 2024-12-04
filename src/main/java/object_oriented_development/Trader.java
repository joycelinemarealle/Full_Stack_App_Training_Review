package object_oriented_development;
public class Trader {
    String name;
    Account account;

    public Trader(String name) {
        this.name = name;
        this.account = new Account ("Joyceline", 0.00);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void addTrade(Trade trade){
        Double balance = account.getBalance()+  trade.getPrice() + trade.getQuantity();
        account.setBalance(balance);
    }

    @Override
    public String toString() {
        return "The balance of account name " + account.getName() +
                " is " + account.getBalance();
    }
}
