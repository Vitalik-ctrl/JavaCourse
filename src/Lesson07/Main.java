package Lesson07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        updateList(list);
        System.out.println(list);
        System.out.println(list.get(1) instanceof Integer);
    }
    private static void updateList(List list) {
        list.add("Hello");
        list.add(20);
    }
}