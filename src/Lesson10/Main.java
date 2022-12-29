package Lesson10;

import java.util.HashMap;
import java.util.Map;


public class Main {
    static Map<Product, Company> products = new HashMap<>();
    public static void main(String[] args) throws Exception {

        Product product1 = new Product("Iphone");
        Product product2 = new Product("Samsung A2");

        Company company1 = new Company("Apple");
        Company company2 = new Company("Samsung");

        Company company3 = new Company("Tesla");

        products.put(product1, company1);
        products.put(product2, company2);

     //   addProduct("Iphone");
     //   System.out.println(addProduct("Iphone"));
        System.out.println(checkCompany(company1));
        System.out.println(checkCompany(company3));
        System.out.println(checkCompany(null));
    }

    public static boolean checkCompany(Company company) throws Exception {
        if (company != null) {
            return products.containsValue(company);
        } else {
            throw new Exception("Company does not exist");
        }
    }

    public static Product addProduct(String name) throws Exception {
        Product product;
        if (name != null) {
            product = new Product(name);
            if (isExist(product)) {
                throw new Exception("This object is already exist");
            }
        } else {
            product = new Product(Product.message());
        }
        return product;
    }

    public static boolean isExist(Product product) {
        return products.containsKey(product);
    }
}
