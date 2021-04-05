package pratice.enumsExample;

public class UnitConvertor {
    public static void showMenu() {
        for (LengthUnit lengthUnit : LengthUnit.values()) {
            System.out.println(lengthUnit.ordinal() + " -> " + lengthUnit.name());
        }
    }    /**
     * Converts the value from unit to newUnit.
     * @param value
     * @param unit
     * @param newUnit
     * @return
     */
    public static double convert(double value, LengthUnit unit, LengthUnit newUnit) {
        double valueInMeters = value * unit.getValueInMeters();
        double valueInNewUnit = valueInMeters / newUnit.getValueInMeters();
        return valueInNewUnit;
    }

}
