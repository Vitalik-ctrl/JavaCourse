package Homework14;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int index = rand.nextInt(words.length);
        String guessedWord = words[index];
        Scanner scanner = new Scanner(System.in);
        StringBuilder hint = new StringBuilder("###############");
        while (true) {
            System.out.println("Guess the word:");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equals(guessedWord)) {
                System.out.println("Correct! The word is " + guessedWord + "!");
                break;
            } else {
                int newArrayLength = Math.min(guessedWord.length(), playerAnswer.length());
                System.out.print("Incorrect. Here's a hint: ");
                for (int i = 0; i < newArrayLength; i++) {
                    if (playerAnswer.charAt(i) == guessedWord.charAt(i))
                        hint.setCharAt(i, playerAnswer.charAt(i));
                }
                System.out.println(hint);
            }
        }
    }

}
