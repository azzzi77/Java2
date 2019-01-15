package lesson1;

public class Main {


    public static void main(String[] args) {

        Course course1 = new Course(new Cross(300), new Wall(2), new Water(5));

        Team team1 = new Team("Команда Пупсы", new Human("Иван"), new Cat("Перс"),
                new Dog("Полкан"), new Bird("Кеша"));

        Team team2 = new Team("Команда Зайки", new Human("Катя"), new Cat("Пух"),
                new Dog("Ганс"), new Lol ("Wow"));

        System.out.println("\n===== На старт! Внимание! Марш! =====\n");
        Midi mini = new Midi();
        mini.play();

        System.out.println("\n===== "+team1.teamName+" =====");
        course1.doIt(team1);

        Midi mini2 = new Midi();
        mini2.play();

        System.out.println("\n===== "+team2.teamName+" =====");
        course1.doIt(team2);

        System.out.println("\n===== Результаты эстафеты =====\n");
        team1.showResults();
       // team1.positiveInfo();
        System.out.println();
        team2.showResults();

    }



}
