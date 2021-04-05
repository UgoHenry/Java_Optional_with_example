package pratice.iheritantanceexample;

public class Circle extends Shape {
    public Circle(double radius) {
        super(new double[]{radius});
    }

    public double getRadius() {
        return getDimensions()[0];
    }

    public void setRadius(double radius) {
        getDimensions()[0] = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}