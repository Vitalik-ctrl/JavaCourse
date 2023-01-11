package Lesson10;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class Main {

    static Map<Product, Company> products = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Product product1 = new Product("Iphone", 800, Company.APPLE);
        Product product2 = new Product("Samsung A2", 700, Company.SAMSUNG);
        Product product3 = new Product("Samsung A5", 1000, Company.SAMSUNG);
        Product product4 = new Product("Tesla Model S", 12000, Company.TESLA);

        products.put(product1, Company.APPLE);
        products.put(product2, Company.SAMSUNG);
        products.put(product3, Company.SAMSUNG);
        products.put(product4, Company.TESLA);

        System.out.println("All products: ");
        products.keySet().forEach(System.out::println);

        System.out.println("\nProducts sorted by price in ascending order: ");
        getSortedProducts(Comparator.comparing(Product::getPrice))
                .ifPresent(l -> l.forEach(System.out::println));

        System.out.println("\nProducts made by Samsung: ");
        getProductsByCompany(Company.SAMSUNG)
                .ifPresent(l -> l.forEach(System.out::println));

        System.out.println("\nProducts with a price less than $1000: ");
        getProductsByPrice(1000)
                .ifPresent(l -> l.forEach(System.out::println));

        getRemovedProducts(Company.SAMSUNG)
                .ifPresent(p->p.forEach(System.out::println));
        System.out.println("\nAll products after removing Samsung products:");
        products.keySet().forEach(System.out::println);

    }

    public static Optional<List<Product>> getRemovedProducts(Company company) {
        List<Product> removedProducts = products.entrySet().stream()
                .filter(entry -> entry.getValue() == company)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        removedProducts.forEach(p-> products.remove(p));
        return Optional.of(removedProducts);
    }


    public static Optional<List<Product>> getSortedProducts(Comparator<Product> comparator) {
        return Optional.of(products.keySet().stream()
                .sorted(comparator)
                .collect(Collectors.toList()));
    }

    public static Optional<List<Product>> getProductsByCompany(Company company) {
        return Optional.of(products.keySet().stream()
                .filter(product -> product.getCompany() == company)
                .collect(Collectors.toList()));
    }

    public static Optional<List<Product>> getProductsByPrice(double price) {
        return Optional.of(products.keySet().stream()
                .filter(product -> product.getPrice() < price)
                .collect(Collectors.toList()));
    }
}