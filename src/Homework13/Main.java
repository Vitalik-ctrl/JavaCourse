package Homework13;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException {
        Store store = new Store();

        store.add(new Product(Type.BOOK, 270, true, LocalDate.parse("2022-03-08")));
        store.add(new Product(Type.BOOK, 310, true, LocalDate.parse("2022-04-08")));
        store.add(new Product(Type.BOOK, 120, false, LocalDate.parse("2022-05-08")));
        store.add(new Product(Type.TOY, 230, true, LocalDate.parse("2022-06-08")));
        store.add(new Product(Type.BOOK, 700, true, LocalDate.parse("2022-07-08")));
        store.add(new Product(Type.TOY, 1000, true, LocalDate.parse("2022-08-08")));
        store.add(new Product(Type.SOUVENIR, 50, true, LocalDate.parse("2022-09-08")));
        store.add(new Product(Type.SOUVENIR, 70, true, LocalDate.parse("2022-10-08")));


        print(store.productsByTypeAndPrice(Type.BOOK, 250));
        print(store.productsByTypeWithDiscount(Type.BOOK, 10));
        System.out.println(store.cheapestProduct(Type.BOOK));
        System.out.println("----------------------------------------");
        print(store.lastProducts());
        System.out.println(store.sum(Type.BOOK, 75, 2023));
        System.out.println("----------------------------------------");
        print(store.productsByTypes());


    }

    public static void print(List list) {
        list.forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

    public static void print(HashMap<Type, List<Product>> hashMap) {
        for (Type type: hashMap.keySet()) {
            System.out.println(type);
            hashMap.get(type).forEach(System.out::println);
        }
    }
}
