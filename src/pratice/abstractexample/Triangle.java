package pratice.abstractexample;

public class Triangle extends Shape {
    public Triangle(double side1, double side2, double side3) {
        super(new double[]{side1, side2, side3});
    }

    public double getSide1() {
        return getDimensions()[0];
    }

    public double getSide2() {
        return getDimensions()[1];
    }

    public double getSide3() {
        return getDimensions()[2];
    }

    public void setSide1(double side) {
        getDimensions()[0] = side;
    }

    public void setSide2(double side) {
        getDimensions()[1] = side;
    }

    public void setSide3(double side) {
        getDimensions()[2] = side;
    }

    public double getSemiperimeter() {
        return getPerimeter() / 2;
    }

    @Override
    public double getArea() {
        double sp = getSemiperimeter();
        return Math.sqrt(sp * (sp - getSide1()) * (sp - getSide2()) * (sp - getSide3()));
    }
}
