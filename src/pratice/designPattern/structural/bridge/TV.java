package pratice.designPattern.structural.bridge;

public class TV implements Device{
    private boolean on = false;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;

    }

    @Override
    public void disable() {
        on = false;

    }

    @Override
    public void printStatus() {
        System.out.printf("TV is %s ", on);

    }
}
