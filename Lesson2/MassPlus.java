package Lesson2;

public class MassPlus {

    public static int mplus(String[][] strArray)  throws SizeException, DataException {

        int sum = 0;

        if (strArray.length != 4) throw new SizeException();

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].length != 4) throw new SizeException();

            for (int k = 0; k < strArray[i].length; k++) {

                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException q) {
                    throw new DataException(i, k);
                }
            }
        }

        return sum;
    }

}
