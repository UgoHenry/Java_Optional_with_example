package pratice.exceptionExample;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // generating a division by 0 exception
            // to see how the code works without having an exception just drop the / 0
            int x = 5 / 1;
            int[] arr = new int[]{10, 7};
            System.out.println(x);
            // generating an index out of bounds exception
            // to see how the code works without having an exception use index 0 or 1
            System.out.println(arr[2]);
            String s = null;
            // generating a null pointer exception
            // to see how the code works without having an exception give a non-null value to variable s
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (Exception e) {
            System.out.println("Another exception!");
        } finally {
            // message is shown no matter if an exception is thrown or not
            System.out.println("Good bye!");
        }
        System.out.println("Program ran without exceptions or exceptions were handled :)");
    }
}