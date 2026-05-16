import java.util.List;

public class MusicalShow extends Show {
    protected final String musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors,
                       String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.print(librettoText);
    }
}
