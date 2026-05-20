import java.util.ArrayList;

public class Theatre {
    private static final Actor NIJINSKY = new Actor("Вацлав", "Нижинский", Gender.MALE, 163);
    private static final Actor PONAROVSKAYA = new Actor("Ирина", "Понаровская", Gender.FEMALE, 155);
    private static final Actor OJOGIN = new Actor("Иван", "Ожогин", Gender.MALE, 193);
    private static final Actor PONAROVSKAYAO = new Actor("Ольга", "Понаровская", Gender.FEMALE, 170);

    private final static Director DIMITRIN = new Director("Юрий", "Димитрин", Gender.MALE, 15);
    private static final Director BALTUS = new Director("Корнелиус", "Балтус", Gender.MALE, 20);



    public static void main(String[] args) {
        Show vampiresBall = new Show("Бал вампиров", 180, BALTUS, new ArrayList<>());

        String balletLibretto = "Жгучий осенний полдень, наполненный раздражающими испарениями вянущих листьев. " +
                "Над обрывами свесились рдеющие платаны, над водами склонились бледные ивы. Молодой голый фавн, " +
                "бледно-желтый, покрытый черными пятнами, какими бывают козлы, пасущиеся на лугах Греции, " +
                "греется на солнце перед своей пещерой и играет на короткой флейте";

        Ballet theAfternoonOfAFaun = new Ballet("Послеполуденный отдых фавна", 60, DIMITRIN,
                new ArrayList<>(), "Клод-Ашиль Дебюсси", balletLibretto, "Вацлав Нижинский");

        String operaLibretto = "Завязка: Певец Орфей побеждает в конкурсе, получая в награду от судьи Харона " +
                "волшебную лиру и всеобщее признание, после чего женится на Эвридике.Поворотный момент: " +
                "Слава вскружила Орфею голову, и он отдаляется от возлюбленной. Эвридика уходит от него и погибает " +
                "от укуса змеи.Путь во тьму: Сломленный горем Орфей спускается за ней в подземный мир, " +
                "где Харон ставит условие: забрать Эвридику можно, но оглядываться назад нельзя.Финал: " +
                "Поднимаясь из Ада, Орфей нарушает запрет и оборачивается. Эвридика не возвращается к жизни, но по " +
                "замыслу авторов, ее смерть становится стимулом для творчества Орфея — его песня становится вечной.";

        Opera rockOpera = new Opera("Орфей и Эвридика", 120, BALTUS, new ArrayList<>(), "Александром Журбиным",
                operaLibretto, 40);

        System.out.println("\n" + "_".repeat(40) + "\n");
        vampiresBall.addActor(OJOGIN);
        vampiresBall.addActor(PONAROVSKAYA);
        theAfternoonOfAFaun.addActor(NIJINSKY);
        rockOpera.addActor(PONAROVSKAYA);
        rockOpera.addActor(PONAROVSKAYAO);

        System.out.println("\n" + "_".repeat(40) + "\n");
        vampiresBall.printDirector();
        vampiresBall.printActors();
        theAfternoonOfAFaun.printDirector();
        theAfternoonOfAFaun.printActors();
        rockOpera.printDirector();
        rockOpera.printActors();

        System.out.println("\n" + "_".repeat(40) + "\n");
        vampiresBall.replaceActor(NIJINSKY, "Ожогин");
        vampiresBall.printActors();

        System.out.println("\n" + "_".repeat(40) + "\n");
        rockOpera.replaceActor(OJOGIN, "Нижинский");
        rockOpera.printActors();
        rockOpera.replaceActor(OJOGIN, "Понаровская");
        rockOpera.printActors();

        System.out.println("\n" + "_".repeat(40) + "\n");
        theAfternoonOfAFaun.printLibrettoText();
        rockOpera.printLibrettoText();
    }
}
