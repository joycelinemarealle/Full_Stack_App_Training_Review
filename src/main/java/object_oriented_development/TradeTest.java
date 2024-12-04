package object_oriented_development;

public class TradeTest {
    public static void main (String [] args){
    Trade trade1 = new Trade ( 1, "APPL", 20.00,1);
    Trade trade2 = new Trade ( 2, "BLPL", 30.00,2);
    System.out.println(trade1);
    System.out.println(trade2);

    trade1.setPrice(2.23);
    }
}
