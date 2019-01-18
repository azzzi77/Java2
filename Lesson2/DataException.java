package Lesson2;

public class DataException extends ExceptionOne {

    public DataException(int row, int col) {
        super(String.format("Ошибка. Вы указали не тот тип в массиве, адрес ячейки: %d, %d", row, col));
    }
}