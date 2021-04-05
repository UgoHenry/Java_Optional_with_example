package pratice.abstractexample;

public class MainAbstract {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(rectangle1);
        System.out.printf("perimeter: %.2f%n", rectangle1.getPerimeter());
        System.out.printf("area: %.2f%n", rectangle1.getArea());
        Circle circle1 = new Circle(3);
        System.out.println(circle1);
        System.out.printf("perimeter: %.2f%n", circle1.getPerimeter());
        System.out.printf("area: %.2f%n", circle1.getArea());
        Square square1 = new Square(6);
        System.out.println(square1);
        System.out.printf("perimeter: %.2f%n", square1.getPerimeter());
        System.out.printf("area: %.2f%n", square1.getArea());
        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println(triangle1);
        System.out.printf("perimeter: %.2f%n", triangle1.getPerimeter());
        System.out.printf("area: %.2f%n", triangle1.getArea());
        Shape[] shapes = {rectangle1, circle1, square1, triangle1};
        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape currentShape : shapes) {
            totalArea += currentShape.getArea();
            totalPerimeter += currentShape.getPerimeter();
            //System.out.println(currentShape.getClass().getSimpleName());
        }        // with printf method %n is a format code for new line (enter)
        // %.2f is a format code for printing a floating point number with only 2 decimals
        System.out.printf("%nTotal perimeter: %.2f%n", totalPerimeter);
        System.out.printf("%nTotal area: %.2f%n", totalArea);
    }
}
