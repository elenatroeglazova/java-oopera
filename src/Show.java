import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    // Метод, печатающий информацию о режиссере (Имя Фамилия)
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
            int count = 0;
            int index = -1;
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(replacingActorSurname)) {
                    count++;
                    index = listOfActors.indexOf(actor);
                }
            }

            if (count > 1) {
                System.out.println("В списке актеров шоу '" + this.title + "' есть несколько актеров с фамилией "
                + replacingActorSurname + ". Замена не произведена.");
            } else if (count == 1) {
                listOfActors.set(index, newActor);
                System.out.println("Замена актеров в спектакле '" + this.title+ "':");
                System.out.println("Актер " + replacingActorSurname + " заменен на актера " + newActor);
            } else {
                System.out.println("Актер " + replacingActorSurname + " не был заменен: Актера с фамилией "
                        + replacingActorSurname + " нет в списке актеров шоу '" + this.title + "'");
            }
        }
    }
}
