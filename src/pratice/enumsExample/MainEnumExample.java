package pratice.enumsExample;

import java.util.Scanner;

public class MainEnumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitOrdinal;
        LengthUnit unit;
        double value;
        int newUnitOrdinal;
        LengthUnit newUnit;        System.out.println("Chose unit to convert from:");
        UnitConvertor.showMenu();
        unitOrdinal = scanner.nextInt();
        unit = LengthUnit.values()[unitOrdinal];        System.out.print("Input value in " + unit + ": ");
        value = scanner.nextDouble();        System.out.println("Chose unit to convert to:");
        UnitConvertor.showMenu();
        newUnitOrdinal = scanner.nextInt();
        newUnit = LengthUnit.values()[newUnitOrdinal];        System.out.println(value + " " + unit + " = "
                + UnitConvertor.convert(value, unit, newUnit) + " "+newUnit);
    }
}
