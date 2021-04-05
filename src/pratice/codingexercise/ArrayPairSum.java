package pratice.codingexercise;
/*
Write a Java program to find all pairs of elements in
an array whose sum is equal to a specified number.
 Ex: [1, 2, 7, 3, 10, 2, 9] with sum 4
Output: 1-3; 2-2
 */
public class ArrayPairSum {
    public static void showPairs(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.print(arr[i] + "+" + arr[j]+" ");
                }
            }
        }
        System.out.println();
    }    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 7, 3, 10, 2, 9};
        int sum1 = 4;
        ArrayPairSum.showPairs(numbers1, sum1);
        int[] numbers2 = {1, 2, 7, 3, 10, 2, 9, 5, 6, 3, 6, 2, 1};
        int sum2 = 12;
        ArrayPairSum.showPairs(numbers2, sum2);
    }
}
