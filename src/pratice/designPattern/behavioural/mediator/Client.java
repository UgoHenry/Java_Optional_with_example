package pratice.designPattern.behavioural.mediator;

public class Client {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        Boeing boeingAircraft = new Boeing(controlTower);
        boeingAircraft.requestControlTower();
        controlTower.run();
    }
}
