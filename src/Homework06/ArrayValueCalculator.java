package Homework06;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            int result = dooCalc(array);
            System.out.println("Result: " + result);
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException was thrown: " + e.getMessage());
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException was thrown: " + e.getMessage());
        }
    }

    public static int dooCalc(String[][] array) throws ArrayDataException, ArraySizeException {
        if (array.length != 4) throw new ArraySizeException();
        else {
            for (int i = 0; i < 4; i++) {
                if (array[i].length != 4) throw new ArraySizeException();
            }
        }
        int result = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return result;
    }

}
