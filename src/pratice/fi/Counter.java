package pratice.fi;

public class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void modifyValue(int modifier) {
        this.value = this.value + modifier;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        counter.modifyValue(8);
        System.out.println(counter.getValue());
    }

}


