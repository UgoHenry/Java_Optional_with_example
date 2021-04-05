package pratice.codingexercise;

/*
An example of using the char type (The char data type is a single 16-bit Unicode character).
 */
public class CharTypeExample {
    public static void main(String[] args) {
        int sum = 0;
        String text = "";
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.printf("%s %d %n", i, (int) i);
            sum += i;
            text += i;
        }
        System.out.println("Sum of codes: " + sum);
        System.out.println("Characters concatenated into a string: " + text);
    }
}
