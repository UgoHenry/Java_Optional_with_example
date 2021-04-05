package pratice.designPattern.creational.builder;

public class Director {
    public void createSUVCars(Builder builder){
        builder.setCarType("SUV");
        builder.setCarColor("Black");
        builder.setSeat(5);

    }
}
