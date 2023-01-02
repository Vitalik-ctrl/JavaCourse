package Homework07;

public class Element {
    String name;
    int count;

    public Element(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
