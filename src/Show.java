import java.util.List;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println("Режиссер шоу '" + this.title + "': " + director);
    }

    public void printActors() {
        System.out.println("Список актеров шоу '" + this.title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor + " не был добавлен: " +
                    "Этот актер уже выступает в шоу '" + this.title + "'");
        }  else {
            listOfActors.add(actor);
            System.out.println("В спектакль '" + this.title + "' введен новый актер " + actor);
        }
    }

    public void replaceActor(Actor newActor, String replacingActorSurname) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor + " уже выступает в спектакле '" + this.title + "'");
        } else {
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(replacingActorSurname)) {
                    int index = listOfActors.indexOf(actor);
                    listOfActors.set(index, newActor);
                    System.out.println("Замена актеров в спектакле '" + this.title+ "':");
                    System.out.println("Актер " + replacingActorSurname + " заменен на актера " + newActor);
                    return;
                }
            }

            System.out.println("Актер " + replacingActorSurname + " не был заменен: Актера с фамилией "
                    + replacingActorSurname + " нет в списке актеров шоу '" + this.title + "'");
        }
    }
}
