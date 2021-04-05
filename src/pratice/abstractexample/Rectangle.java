package pratice.abstractexample;

public class Rectangle extends Shape{
    public Rectangle(double width, double length) {
        super(new double[]{width, length, width, length});
    }

    public double getWidth() {
        return getDimensions()[0];
    }

    public double getLength() {
        return getDimensions()[1];
    }

    public void setWidth(double width) {
        getDimensions()[0] = width;
        getDimensions()[2] = width;
    }

    public void setLength(double length) {
        getDimensions()[1] = length;
        getDimensions()[3] = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }



}
