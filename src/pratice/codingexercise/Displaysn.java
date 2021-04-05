package pratice.codingexercise;

import java.util.Scanner;

public class Displaysn {
    public static void main(String[] args) {
        System.out.print("Insert number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            System.out.print(", ");
        }
    }
}
