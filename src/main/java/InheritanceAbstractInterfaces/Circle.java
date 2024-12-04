package InheritanceAbstractInterfaces;

public class Circle extends Shape{
    private double radius;

    public Circle( Double x, double y, Double radius){
        super(x,y);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public Double getCircumference(){
        return 2* Math.PI* radius;
    }
}
