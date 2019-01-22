package lesson_3;

public class Job_2 {

     public static void go() {
        PhoneB phoneB = new PhoneB();

         phoneB.add("Петров", "8588584838");
         phoneB.add("Петров", "88487737374");
         phoneB.add("Иванов", "89583823423");
         phoneB.add("Иванов", "858427234343");
         phoneB.add("Сидоров", "83453452345");
         phoneB.add("Козлова", "876464564565");
         phoneB.add("Тапочкина", "8623434545");
         phoneB.add("Потапченко", "87623672533");
         phoneB.add("Потапченко", "877553456230");
         System.out.println("");

         System.out.println("Работаем со справочником телефонов (добавляем и выводим):");
        System.out.println("Петров\\Петровы: "+phoneB.get("Петров"));
        System.out.println("Иванов\\Ивановы: "+phoneB.get("Иванов"));
        System.out.println("Козлова\\Козловы: "+phoneB.get("Козлова"));
        System.out.println("Потапченко\\Потапченковы: "+phoneB.get("Потапченко"));
    }

}


