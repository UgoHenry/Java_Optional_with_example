package pratice.authorclass;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }
    public static String getAuthorNameOfLongestPoem(Poem[] poems){
        String authorName = " ";
        int maxNoOfStrophes= 0;
        for (int i = 0; i < poems.length; i++){
            if(poems[i].stropheNumbers>maxNoOfStrophes){
                maxNoOfStrophes = poems[i].stropheNumbers;
                authorName = poems[i].creator.getSurname();
            }
        }
        return authorName;
    }
}
