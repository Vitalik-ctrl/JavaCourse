package Homework07;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        String[] strings = {"Banana", "Watermelon", "Apple", "Plum", "Cherry", "Banana",
                "Orange", "Grape", "Plum", "Peach", "Banana", "Grapefruit",
                "Orange", "Strawberry", "Mango", "Grapefruit"};

        System.out.println("Task 1 --------------------------------");
        List<String> stringsList = new ArrayList<>(toList(strings));
        String string = "Banana";
        System.out.println(countOccurrence(stringsList, string));
        System.out.println("Task 2 --------------------------------");
        System.out.println(toList(strings));
        System.out.println("Task 3 --------------------------------");
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(78);
        list.add(12);
        list.add(4);
        list.add(3);
        System.out.println(findUnique(list));
        System.out.println("Task 4 --------------------------------");
        calcOccurrence(toList(strings));
        System.out.println("Task 5 --------------------------------");
        System.out.println(findOccurrence(toList(strings)));
    }

    public static int countOccurrence(List<String> list, String string) {
        int count = 0;
        for (String el : list) {
            if (el.equals(string)) count++;
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> list) {
        HashSet<Integer> hashSet = new HashSet<>(list);
        return hashSet.stream().toList();
    }

    public static void calcOccurrence(List<String> list) {
        HashSet<String> hashSet = new HashSet<>(list);
        for (String el : hashSet) {
            System.out.println(el + ": " + Collections.frequency(list, el));
        }
    }

    public static List<String> findOccurrence(List<String> list) {
        List<String> elements = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>(list);
        for (String el : hashSet) {
            Element element = new Element(el, Collections.frequency(list, el));
            elements.add(element.toString());
        }
        return elements;
    }

}
