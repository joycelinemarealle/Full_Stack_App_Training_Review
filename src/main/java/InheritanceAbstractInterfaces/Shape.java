package InheritanceAbstractInterfaces;
import java.awt.*;
public class Shape {
    private Double x;
    private Double y;
    private Color color;


    public Shape(Double y, Double x) {
        this.y = y;
        this.x = x;
    }

    public Shape(Double x, Double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Double getCircumference(){
        return null;
    }

    public Double getArea(){
        return null;
    }


}
