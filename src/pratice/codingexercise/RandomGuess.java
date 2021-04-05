package pratice.codingexercise;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Random ran = new Random();
        ran.nextInt(100);
        int nosToguess = ran.nextInt(100);

        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("guess a nos ");
            n = scan.nextInt();
            if (n == nosToguess) {
                System.out.println("Congrat you guess the nos ");
            } else if (n < nosToguess) {
                System.out.println("nos is too little ");
            } else {
                System.out.println("Nos is too much ");
            }
        } while (n != nosToguess);

    }
}
