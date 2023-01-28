package Homework13;

import java.util.*;
import java.util.stream.Collectors;

public class Store {

    List<Product> productList;

    public Store() {
        this.productList = new ArrayList<>();
    }

    public void add(Product product) {
        productList.add(product);
    }

    public List<Product> productsByTypeAndPrice(Type type, int price) {
        return productList.stream()
                .filter(product -> product.type() == type)
                .filter(product -> product.price() >= price)
                .collect(Collectors.toList());
    }

    public List<Product> productsByTypeWithDiscount(Type type, int discount) {
        return productList.stream()
                .filter(product -> product.type() == type)
                .map(product -> product.withPrice(0.9 * product.price()))
                .collect(Collectors.toList());
    }

    public Product cheapestProduct(Type type) throws ProductNotFoundException {
        Optional<Product> resultProduct = productList.stream()
                .filter(product -> product.type() == type)
                .min(Comparator.comparing(Product::price));

        if (resultProduct.isPresent()) {
            return resultProduct.get();
        }
        throw new ProductNotFoundException(type);
    }

    public List<Product> lastProducts() {
        return productList.stream()
                .sorted(Comparator.comparing(Product::dateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double sum(Type type, double price, int year) {
        return productList.stream()
                .filter(product -> product.type() == type)
                .filter(product -> product.price() < price)
                .filter(product -> product.dateAdded().getYear() == year)
                .mapToDouble(Product::price)
                .sum();
    }

    public HashMap<Type, List<Product>> productsByTypes() {
        HashMap<Type, List<Product>> products = new HashMap<>();
        for (Type type : Type.values()) {
            products.put(type, productList.stream().filter(product -> product.type() == type).toList());
        }
        return products;
    }




}
