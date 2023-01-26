package Homework14;

public class StringMethods {

    public int findSymbolOccurrence(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public String stringReverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String string) {
        String reversed = stringReverse(string);
        return string.equals(reversed);
    }
}
