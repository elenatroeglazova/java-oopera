import java.util.List;

public class Opera extends MusicalShow {
    private final int choirSize;


    public Opera(String title, int duration, Director director, List<Actor> listOfActors,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
