package Homework03;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal() {

    }

    public String getName() {
        if (this.name != null && !this.name.isEmpty()) {
            return name;
        }
        return "This animal";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        if (this.color.isEmpty()) {
            return color;
        }
        return "undefined";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String run(int distance) {
        return this.getName() + " ran " + distance + " m.";
    }

    public String swim(int distance) {
        return this.getName() + " swam " + distance + " m.";
    }


}
