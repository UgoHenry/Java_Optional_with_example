package pratice.designPattern.behavioural.mediator;

public class Boeing implements Aircraft {
    ControlTower tower;

    public Boeing(ControlTower tower) {
        this.tower = tower;
    }

    public void requestControlTower(){
        tower.requestToLand(this);
    }

    @Override
    public void land() {
        System.out.println("Boeing is landing");
    }
}
