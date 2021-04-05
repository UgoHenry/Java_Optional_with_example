package pratice.codingexercise;
/*
Write a program to compute the sum of the digits of a number.
ex: for 48957 sum of digits is 4+8+9+5+7=33
 */

public class SumOfDigits {
    public static int getSumOfDigitsVersion1(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = (int) number % 10;
            sum += digit;
            number /= 10;
            //System.out.println("last digit: " + digit + " new number to extract digits: " + number);
        }
        return sum;
    }

    public static int getSumOfDigitsVersion2(int number) {
        int sum = 0;
        String numberAsString = "" + number; // using string concatenation to get the string representation of the number
        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt(numberAsString.charAt(i) + "");
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 48957;
        int number2 = Integer.MAX_VALUE; // 2147483647
        System.out.println("Sum of digits is " + SumOfDigits.getSumOfDigitsVersion1(number1));
        System.out.println("Sum of digits is " + SumOfDigits.getSumOfDigitsVersion2(number1));
        System.out.println("Sum of digits is " + SumOfDigits.getSumOfDigitsVersion1(number2));
        System.out.println("Sum of digits is " + SumOfDigits.getSumOfDigitsVersion2(number2));
    }
}
