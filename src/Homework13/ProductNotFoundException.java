package Homework13;

public class ProductNotFoundException extends Exception{
    String type;

    public ProductNotFoundException(Type type) {
        super("Product [category: " + type.toString() + "] not found");
        this.type = String.valueOf(type);
    }
}
