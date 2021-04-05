import java.util.Scanner;

public class bpractice {
    public static void main(String[] args) {

        System.out.println("Input a number to fizzbuzz on!");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 3 == 0) {
            System.out.print("Fizz");
        }
        if (i % 5 == 0) {
            System.out.print("Buzz");
        }
    }

}
