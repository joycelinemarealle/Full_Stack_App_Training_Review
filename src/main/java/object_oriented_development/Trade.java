package object_oriented_development;

public class Trade {
    private Integer id;
    private String symbol;
    private Double price;
    private Integer quantity;



    public Trade (Integer id, String symbol, Double price, Integer quantity){
        this.id = id;
        this.symbol = symbol;
        if (price > 0 ){this.price = price;}
        else {throw new IllegalArgumentException("Price must be greater than zero");}
        this.quantity = quantity;
    }
    public Trade (Integer id, String symbol,Integer quantity){
        this.id = id;
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString (){
       return "Trade{"+
               "id = " + id +
               ", symbol = " + symbol +
               ", price = " + price  +
                " , quantity = " + quantity +
               "}"
               ;
    }

    public void setPrice ( Double price){
        if (price > 0 ){
            this.price = price;
        } else{
            throw new IllegalArgumentException("Price must be positive");
        }

    }

    public Double getPrice (){
        return this.price;
    }

    public Integer getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
