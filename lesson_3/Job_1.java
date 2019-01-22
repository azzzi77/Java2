package lesson_3;

import java.util.HashMap;
import java.util.Map;

public class Job_1 {

    public static void go() {
        Map<String, Integer> maps = new HashMap<>();
        String[] words = {
                "Мясо", "Сыр", "Яблоко",
                "Сыр", "Картошка", "Суп",
                "Колбаса", "Виноград", "Мясо",
                "Стейк", "Виноград", "Яйцо",
                "Стейк", "Киви", "Омлет",
                "Колбаса", "Груша", "Гречка", "Рис"
        };

        for (int i = 0; i < words.length; i++) {
            if (maps.containsKey(words[i]))
                maps.put(words[i], maps.get(words[i]) + 1);
            else
                maps.put(words[i], 1);
        }
        System.out.println("");
        System.out.println("Выводим массив слов, с подсчетом повторов:");
        System.out.println(maps);

    }
}
