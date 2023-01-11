package Lesson09;

public class Cafe {

    private String name;
    private String address;
    private Type type;
    private double rating;
    private int assortment;

    public Cafe(String name, String address, Type type, double rating, int assortment) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.rating = rating;
        this.assortment = assortment;
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

    public int getAssortment() {
        return assortment;
    }

    public void setAssortment(int assortment) {
        this.assortment = assortment;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                ", assortment=" + assortment +
                '}';
    }
}