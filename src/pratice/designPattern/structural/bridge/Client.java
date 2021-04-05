package pratice.designPattern.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        tv.printStatus();
        basicRemote.power();
        tv.printStatus();

        Device radio =  new Radio();
        basicRemote = new BasicRemote(radio);
        basicRemote.power();
        radio.printStatus();
        basicRemote.power();
        radio.printStatus();



    }
}
