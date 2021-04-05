package pratice.interfaceExample;

public class MainInterface {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(4, 5),
                new Circle(3),
                new Square(6),
                new Triangle(3, 4, 5)
        };
        double totalPerimeter = 0;
        double totalArea = 0;
        for (Shape currentShape : shapes) {
            totalPerimeter += currentShape.getPerimeter();
            totalArea += currentShape.getArea();
            System.out.println(currentShape.printShape());
        }        // with printf method %n is a format code for new line (enter)
        // %.2f is a format code for printing a floating point number with only 2 decimals
        System.out.printf("%nTotal perimeter: %.2f%n", totalPerimeter);
        System.out.printf("%nTotal area: %.2f%n", totalArea);
    }
}
