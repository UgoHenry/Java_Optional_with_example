package pratice.authorclass;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("James", "UK");
        Poem[] poems = new Poem[4];
        poems[0] = new Poem(new Author("Shkes", "British"), 10);
        poems[1] = new Poem(author, 98);
        poems[2] = new Poem(new Author("silvija", "Romanian"), 100);
        poems[3] = new Poem(author, 20);
        System.out.println(" The author with the greatest nos strophes is: ");
        System.out.println(Poem.getAuthorNameOfLongestPoem(poems));
    }
}
