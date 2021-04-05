package pratice.abstractexample;

public class Square extends Rectangle {
    public Square(double size) {
        super(size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }
}
