package records;

public class Shop {
    public static void main (String [] args){
        InventoryItem item1 = new InventoryItem("shoes", 12.21);
        InventoryItem item2 = new InventoryItem("blouse", 15.13);

        double total_price = item1.price() + item2.price();
        System.out.println(total_price);

        Sale sale1 = new Sale (item1, 4);
        Double total_cost = item1.price() * sale1.quantity();
        System.out.println(total_cost);
    }
}
record InventoryItem(String item, Double price){}
record Sale (InventoryItem item, Integer quantity){}
