package pratice.iheritantanceexample;

public class MainShapeIheritanceExample {
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
    }
}

