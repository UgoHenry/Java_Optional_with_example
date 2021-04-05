package pratice.fi;

public class Main {
    public static void main(String[] args) {
        Person lorraine = new Person();
        TimeMachine tardis = new TimeMachine(lorraine);
        tardis.travelInTime(6);
        System.out.println(lorraine.getYear());
    }

}
