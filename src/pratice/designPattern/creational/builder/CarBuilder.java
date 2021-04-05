package pratice.designPattern.creational.builder;

public class CarBuilder implements Builder{
    String carType;
    int seat;
    String carColor;

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void setSeat(int seat) {
        this.seat = seat;

    }

    @Override
    public void setCarColor(String carColor) {
        this.carColor = carColor;

    }
}
