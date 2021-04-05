package pratice.interfaceExample;

public class Square extends Rectangle {
    public Square(double size) {
        super(size, size);
    }

    @Override
    public double[] getDimensions() {
        return new double[]{this.getWidth()};
    }
}
