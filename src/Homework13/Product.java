package Homework13;

import java.time.LocalDate;

public record Product(Type type, double price, boolean discountPossibility, LocalDate dateAdded) {

    public Product withPrice(double price) {
        return new Product(type(), price, discountPossibility(), dateAdded());
    }

}


