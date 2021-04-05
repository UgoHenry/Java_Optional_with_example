package pratice.abstractexample;

public abstract class Shape {
    private double[] dimensions;

    public Shape(double[] dimensions) {
        this.dimensions = dimensions;
    }

    public double[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(double[] dimensions) {
        this.dimensions = dimensions;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < dimensions.length; i++) {
            perimeter += dimensions[i];
        }
        return perimeter;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        String dims = "(";
        for (int i = 0; i < dimensions.length; i++) {
            dims += dimensions[i] + " ";
        }
        dims = dims.trim();
        dims += ")";
        return getClass().getSimpleName().toLowerCase() + " " + dims;
    }
}
