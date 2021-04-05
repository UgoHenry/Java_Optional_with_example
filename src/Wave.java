public class Wave {
    public static void main(String[] args) {
        int wave_height = 6;
        //int e=6;
        for (int i = 1; i < wave_height; i++) {
            for (int j = 0; j <i; j++)
                System.out.print(i+" ");
                System.out.println();

        }
        for (int k = 6; k >= 1; k--) {
            for (int j = 0; j <k; j++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }

        for (int a = 0; a < 6; a++) {
            for (int b = 2*(6-a); b>=0; b--) {
                System.out.print(" ");
            }
            for (int b=0;b<=a;b++){
                System.out.print("* ");
            }
            System.out.println("");

        }
        System.out.println("\n");

        for (int c = 7; c >= 1; c--) {
            for (int d = 7; d>c; d--) {
                System.out.print(" ");
            }
            for (int e=1;e<=c;e++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
