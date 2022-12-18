package Homework05;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println("1. --------------");
        printThreeWords();
        System.out.println("2. --------------");
        checkSumSign();
        System.out.println("3. --------------");
        printColor();
        System.out.println("4. --------------");
        compareNumbers();
        System.out.println("5. --------------");
        System.out.println(checkSum(10, 2));
        System.out.println("6. --------------");
        numberSign(-21);
        System.out.println("7. --------------");
        System.out.println(isNegative(-12));
        System.out.println("8. --------------");
        stringForNTimes("Ukraine", 3);
        System.out.println("9. --------------");
        System.out.println(isLeapYear(2024));
    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -12;
        int sum = a + b;
        System.out.println(sum >= 0 ? "Сума позитивна" : "Сума негативна");
    }

    public static void printColor() {
        int value = -12;
        System.out.println(value <= 0 ? "Червоний" : value <= 100 ? "Жовтий" : "Зелений");
    }

    public static void compareNumbers() {
        int a = 10, b = 12;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void numberSign(int number) {
        System.out.println(number < 0 ? "Positive number" : "Negative number");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void stringForNTimes(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(string);
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
