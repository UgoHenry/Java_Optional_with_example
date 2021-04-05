package pratice.lamda;

import java.util.function.BinaryOperator;

/**
 * Implement arithmetic operations using lambda expressions:
 * Addition, subtraction, multiplication, division.
 */
public class ArithmeticOperations {
    public static void main(String[] args) {
        double x = 11.5;
        double y = 6.7;
        // addition
        BinaryOperator<Double> add = (a, b) -> a + b;
        System.out.printf("%.2f + %.2f = %.2f%n", x, y, add.apply(x, y));
        // subtraction
        BinaryOperator<Double> subtract  = (a, b) -> a - b;
        System.out.printf("%.2f + %.2f = %.2f%n", x, y, subtract.apply(x, y));
        // multiplication
        BinaryOperator<Double> multiply  = (a, b) -> a * b;
        System.out.printf("%.2f + %.2f = %.2f%n", x, y, multiply.apply(x, y));
        // division
        BinaryOperator<Double> division  = (a, b) -> a / b;
        System.out.printf("%.2f + %.2f = %.2f%n", x, y, division.apply(x, y));
    }
}