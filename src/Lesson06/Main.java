package Lesson06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = 0;
        HashMap<String, Integer> numerals = new HashMap<String, Integer>();
        int[] elements = new int[s.length()];
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
        numerals.put("D", 500);
        numerals.put("M", 1000);
        for (int i = 0; i < s.length(); i++) {
            if (numerals.containsKey(String.valueOf(s.charAt(i)))) {
                elements[i] = numerals.get(String.valueOf(s.charAt(i)));
            }
        }
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] < elements[i + 1]) {
                result += (elements[i + 1] - elements[i]);
                i = i + 1;
            } else {
                result += elements[i];
            }
        }
        if (elements.length > 1 && elements[elements.length - 1] <= elements[elements.length - 2]) {
            result += elements[elements.length - 1];
        } else if (elements.length == 1) {
            return elements[0];
        }
        return result;
    }

     */
   /* public static void main(String[] args) {
        String result = "";
        String[] strs = {"ab", "a"};
        for (int i = 0; i < strs[0].length(); i++) {
            int count = 0;
            for (String str: strs) {
                if (str.charAt(i) == strs[0].charAt(i)) {
                    count++;
                }
            }
            if (count == strs.length) {
                result += strs[0].charAt(i);
            } else {
                break;
            }
        }
        System.out.println(result);
    }

    */

    public static void main(String[] args) {

        String s1 = "this is index of example";
        //passing substring
        int index1 = s1.indexOf("ids");//returns the index of is substring
        int index2 = s1.indexOf("index");//returns the index of index substring
        System.out.println(index1 + "  " + index2);//2 8

        //passing substring with from index
        int index3 = s1.indexOf("is", 4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

        //passing char value
        int index4 = s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
    }
}

