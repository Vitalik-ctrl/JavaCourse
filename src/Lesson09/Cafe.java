package Lesson09;

public class Cafe {

    public static final int UNSET_ASSORTMENT = Integer.MIN_VALUE;

    private String name;
    private String address;
    private Type type;
    private double rating;
    private int assortment = UNSET_ASSORTMENT;

    public Cafe(String name, String address, Type type, double rating, int assortment) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.rating = rating;
        this.assortment = assortment;
    }

    public Cafe(String name, String address, Type type, double rating) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.rating = rating;
    }

    // method for checking set user assortment value for cafe or not.
    public boolean hasAssortment() {
        return assortment != UNSET_ASSORTMENT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }


    @Override
    public String toString() {
        String assortmentOut = "";
        if (this.hasAssortment())  assortmentOut = ", assortment=" + assortment;
        return "Cafe{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                assortmentOut +
                '}';
    }
}