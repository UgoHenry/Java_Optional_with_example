package pratice.interfaceExample;

public interface Shape {
    double getArea();

    double getPerimeter();

    double[] getDimensions();

    default double getSemiperimeter() {
        return getPerimeter() / 2;
    }

    default String printShape() {
        String s = this.getClass().getSimpleName().toLowerCase() + " (";
        double[] dims = this.getDimensions();
        for (int i = 0; i < dims.length; i++) {
            s += dims[i] + " ";
        }
        return s.trim() + ")";
    }
}
