package pratice.designPattern.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Circle circle =  new Circle();
        circle.radius = 5;
        circle.x = 0;
        circle.y = 0;
        circle.color = "Blue";

        Circle circleCopy = (Circle) circle.clone();


    }
}
