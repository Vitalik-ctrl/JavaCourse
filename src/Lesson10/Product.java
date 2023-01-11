package Lesson10;

public final class Product {
    String name;
    int price;
    Company company;

    public Product(String name, int price, Company company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public static String message() {
        return "Name can't be a null";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}
