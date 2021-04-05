package pratice.designPattern.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower {
    List<Aircraft> landing = new ArrayList<>();
    synchronized public void requestToLand(Aircraft aircraft){
        landing.add(aircraft);

    }
    public void run(){
        while (true){
            while (landing.size()==0);
            Aircraft aircraft;
            synchronized (this){
                aircraft = landing.remove(0);
            }
            aircraft.land();
        }
    }
}
