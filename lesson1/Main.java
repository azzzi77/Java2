package lesson1;

public class Main {



    public static void main(String[] args) {

        Course course1 = new Course(new Cross(300), new Wall(2), new Water(5));

        Team team1 = new Team("Команда Звезды", new Human("Иван"), new Cat("Перс"),
                new Dog("Полкан"), new Bird("Кеша"));

        Team team2 = new Team("Команда Герои", new Human("Катя"), new Cat("Пух"),
                new Dog("Ганс"), new Lol ("Wow"));

        System.out.println("\n===== На старт! Внимание! Марш! Команд учавствует: "+team1.instances+" =====\n");
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

        System.out.println();
        team2.showResults();

        String whoWin = "";
        int counts1 = team1.positiveInfo();
        int counts2 = team2.positiveInfo();

        if (counts1 > counts2) { whoWin = "победа "+team1.teamName; }
        if (counts1 < counts2) { whoWin = "победа "+team2.teamName; }
        if (counts1 == counts2) { whoWin = "НИЧЬЯ"; }

        System.out.println("\n===== ИТОГ СРЕДИ КОМАНД:  [" +whoWin+ "] ["+team1.teamName+" "+counts1+" очка - "+team2.teamName+ " " +counts2+" очка] =====\n");



    }



}
