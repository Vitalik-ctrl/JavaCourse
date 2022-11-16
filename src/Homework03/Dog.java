package Homework03;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    public Dog() {
    }

    @Override
    public String getName() {
        if (super.getName() != null && !super.getName().isEmpty() && !super.getName().equals("This animal")) {
            return super.getName();
        }
        return "This dog";
    }

    @Override
    public String run(int distance) {
        if (distance <= 500 && distance > 0) {
            return super.run(distance);
        }
        return this.getName() + " can't run more than 500 meters.";
    }

    @Override
    public String swim(int distance) {
        if (distance <= 10 && distance > 0) {
            return super.swim(distance);
        }
        return this.getName() + " can't swim more than 10 meters.";
    }

}
