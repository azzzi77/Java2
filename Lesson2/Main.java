package Lesson2;

public class Main {

         public static void main(String[] args) {

             //правильный массив 4 на 4
            String[][] one = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };

             try {
                 int x = MassPlus.mplus(one);
                 System.out.println("Сумма эл.массива: "+x);
             } catch (ExceptionOne q) {
                 System.err.println(q.getMessage());
             }

            // не правильный массив, не та размерность
            String[][] two = {
                    {"1", "2", "3", "4"},
                    {"1", "2"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };


             try {
                 int x2 = MassPlus.mplus(two);
                 System.out.println("Сумма эл.массива: "+x2);
             } catch (ExceptionOne q) {
                 System.err.println(q.getMessage());
             }


            // не правильный массив, не тот тип
            String[][] three = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "три", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };


            try {
                int x3 = MassPlus.mplus(three);
                System.out.println("Сумма эл.массива: "+x3);
            } catch (ExceptionOne q) {
                System.err.println(q.getMessage());
            }
        }
    }
