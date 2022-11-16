package Homework03;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
    }

    @Override
    public String getName() {
        if (super.getName() != null && !super.getName().isEmpty() && !super.getName().equals("This animal")) {
            return super.getName();
        }
        return "This cat";
    }

    @Override
    public String swim(int distance) {
        return "Cats can't swim!";
    }

    @Override
    public String run(int distance) {
        if (distance > 0 && distance <= 200) {
            return super.run(distance);
        }
        return this.getName() + " can't run more than 200 meters.";
    }

}
