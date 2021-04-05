package pratice.enumsExample;

public enum LengthUnit {
    // METER(1) is actually an object of type LengthUnit created like this: new LengthUnit(1)
    // METER(1) is also constant
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);
    private double valueInMeters;

    LengthUnit(double valueInMeters) {
        this.valueInMeters = valueInMeters;
    }

    public double getValueInMeters() {
        return valueInMeters;
    }
}
