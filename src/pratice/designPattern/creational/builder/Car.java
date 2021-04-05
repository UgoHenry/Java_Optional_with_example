package pratice.designPattern.creational.builder;

public class Car extends CarBuilder {
    String carType;
    int seat;
    String carColor;

    public Car(String carType, int seat, String carColor) {
        this.carType = carType;
        this.seat = seat;
        this.carColor = carColor;
    }


}
