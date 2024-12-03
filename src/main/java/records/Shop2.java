package records;

public class Shop2 {
    public static void main (String [] args){
        InventoryItem2 item1 = new InventoryItem2("shoes", 12.21);
        InventoryItem2 item2 = new InventoryItem2("blouse", 15.13);

        double total_price = item1.price() + item2.price();
        System.out.println(total_price);

        Sale2 salea = new Sale2 (item1, 4);
        Double total_cost = item1.price() * salea.quantity();
        System.out.println(total_cost);
    }
}
record InventoryItem2 (String name, Double price){}
record Sale2 (InventoryItem2 item, Integer quantity){
    public Sale2 {
        if (quantity < 0) {
            System.out.println("cant have zero quantity");

        }
    }

    public double CalculatedCost() {
        double price = item.price();

        if (quantity > 5) {
            price = price * 0.80;
            System.out.println("20 discount applied on " + item.name() + "new price" + item.price());

        }
        return price * quantity;
    }}