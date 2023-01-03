package Lesson09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Registry registry = new Registry();
        registry.add(new Cafe("Oliver", "11", Type.CAFE, 5.0));
        registry.add(new Cafe("Host", "11", Type.RESTAURANT, 3.4));
        registry.add(new Cafe("Coffee to Go", "11", Type.COFFEE_HOUSE, 2.1, 12));
        registry.add(new Cafe("XXX cafe", "11", Type.CAFE, 4.2, 18));
        registry.add(new Cafe("McDonald's", "11", Type.RESTAURANT, 4.8, 48));

        List<Cafe> cafelist = new ArrayList<>();
        Cafe cafe;


        cafelist.clear();
        cafelist = registry.filterByAssortment(true);
        output(cafelist); // list of cafes with assortment

        cafelist.clear();
        cafelist = registry.filterByAssortment(false);
        output(cafelist); // list of cafes without assortment

        cafelist.clear();
        List<Type> types = new ArrayList<>();
        types.add(Type.COFFEE_HOUSE);
        types.add(Type.RESTAURANT);
        cafelist = registry.filterByType(types);
        output(cafelist); // list of Coffee houses and Restaurants only

        cafelist.clear();
        cafelist = registry.allCafes();
        output(cafelist); // list of all Cafes

        cafe = registry.findByName("Oliver");
        System.out.println(cafe + "\n+------------------------------------+"); // Cafe Oliver data
        cafe = registry.findByName("Oliva"); // CafeNotFoundException
        System.out.println(cafe);


    }

    // method for print list in readable way
    public static void output(List<Cafe> cafeList) {
        for (Cafe cafe : cafeList) {
            System.out.println(cafe);
        }
        System.out.println("+------------------------------------+");
    }

}
