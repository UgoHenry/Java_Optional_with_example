package pratice.vpattern;

public class Vpattern {
    public static void main(String[] args) {
        int a = 5;
        int ry = 1;
        int rz = a * 2 - 1;
        for (int p = 1; p <= a; p++) {
            for (int q = 1; q <= a * 2; q++) {
                if (q == ry || q == rz) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            ry++;
            rz--;
            System.out.println();
        }
        for (int p = 1; p >= a; p++) {
            for (int q = 1; q >= a * 2; q++) {
                if (q == ry || q == rz) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            ry++;
            rz--;
            System.out.println("\n");
        }
    }
}
