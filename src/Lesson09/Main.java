package Lesson09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Registry registry = new Registry();
        registry.add(new Cafe("Oliver", "11", Type.CAFE, 5.0, 0));
        registry.add(new Cafe("Host", "11", Type.RESTAURANT, 3.4, 0));
        registry.add(new Cafe("Coffee to Go", "11", Type.COFFEE_HOUSE, 2.1, 12));
        registry.add(new Cafe("XXX cafe", "11", Type.CAFE, 4.2, 18));
        registry.add(new Cafe("McDonald's", "11", Type.RESTAURANT, 4.8, 48));

        List<Cafe> cafelist;
        Cafe cafe;

        cafelist = registry.filterByAssortment();
        output(cafelist); // list of cafes with assortment

        cafelist.clear();
        cafelist = registry.filterByType(Type.RESTAURANT);
        output(cafelist); // list of Restaurants only

        cafelist.clear();
        cafelist = registry.allCafes();
        output(cafelist); // list of all Cafes

        System.out.println("\n");
        System.out.println(registry.findByName("Oliver")); // Cafe Oliver Data


    }
    // method for print list in readable way
    public static void output(List<Cafe> cafeList) {
        System.out.println("\n");
        cafeList.forEach(System.out::println);
    }
}
