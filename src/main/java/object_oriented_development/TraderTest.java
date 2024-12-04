package object_oriented_development;

public class TraderTest {
    public static void main (String [] args){
        Trader trader = new Trader ("Eva");
        Trade trade1 = new Trade ( 1, "APPL", 20.00,1);
        Trade trade2 = new Trade ( 2, "BLPL", 30.00,2);

        trader.addTrade(trade1);
        System.out.println(trader);
    }
}
