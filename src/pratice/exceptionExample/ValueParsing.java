package pratice.exceptionExample;

import java.util.Scanner;

/**
 * Write an application that will read the input and print back value that user provided ,
 * use try catch statements to parse the input , e.g . I/
 * Input: 10
 * Output: int --> 10
 * Input: 10.0
 * Output: double --> 10.0
 * Input: Hello!
 * Output: Hey! That's not a value ! Try once more.
 */
public class ValueParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean valueIsString;
        do {
            System.out.print("Input a value: ");
            input = scanner.next();
            valueIsString = false;
            try {
                int n = Integer.parseInt(input);
                System.out.println("int --> " + n);
            } catch (Exception e) {
                try {
                    double d = Double.parseDouble(input);
                    System.out.println("double --> " + d);
                } catch (Exception e1) {
                    valueIsString = true;
                    System.out.println("Hey! That's not a value ! Try once more.");
                }
            }
        } while (valueIsString);
    }
}