package InheritanceAbstractInterfaces;

public class Rectangle extends Shape{
    private Double x;
    private Double y;
    private Double width;
    private Double height;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Rectangle (Double x, Double y, Double width, Double height) {
        super (x,y);
        this.width = width;
        this.height = height;


    }

}
