package pratice.codingexercise;

public class Countletters {
    /*    Write a Java program to count the letters, spaces,
     numbers and other characters of an input string: “Aa kiu, I swd skieo
     2387. GH kiu: sieo?? 25.33” Output: 23 letters, 9 spaces, 8 numbers, 6 others
     */
    public static void count(String s) {
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                letters++;
            } else if (c == ' ') {
                spaces++;
            } else if ('0' <= c && c <= '9') {
                numbers++;
            } else {
                others++;
            }
        }
        System.out.println(letters + " letters, "
                + spaces + " spaces, "
                + numbers + " numbers, "
                + others + " others");
    }

    public static void main(String[] args) {
        String text1 = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        Countletters.count(text1);
        String text2 = "I want spring to come! From tomorrow 14.02.2021!";
        Countletters.count(text2);
    }


}
