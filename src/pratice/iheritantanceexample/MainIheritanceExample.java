package pratice.iheritantanceexample;

public class MainIheritanceExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(20);
        Car car = new Car(200, true);
        System.out.println("vehicle: " + vehicle);
        System.out.println("car: " + car);
        System.out.println();
    }
}
