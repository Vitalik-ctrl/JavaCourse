package Lesson02;

public class Car {
    private String color;
    private boolean isExpensive;
    private int countOfDoors;
    private String model;

    public Car(String color, boolean isExpensive, int countOfDoors) {
        this.color = color;
        this.isExpensive = isExpensive;
        this.countOfDoors = countOfDoors;
    }

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getColor() {
        if (this.color.isEmpty()) {
            return "Error. Color wasn't set.";
        }
        color = color.toUpperCase();
        return this.color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            this.color = "Green";
            return;
        }
        this.color = color;
    }

    public boolean isExpensive() {
        return isExpensive;
    }

    public void setExpensive(boolean expensive) {
        isExpensive = expensive;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public void move(String color) {
        switch (color) {
            case "GREEN":
                System.out.println("Green car is moving.");
                break;
            case "RED":
                System.out.println("Red car is moving.");
                break;
            case "Error. Color wasn't set.":
                System.out.println("How car without color should move?!");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
    }

    public String modelCar(String color, String model, boolean isExpensive) {
        String message = "It's not interesting, we don't know what's the car actually.";
        if (color.equals("RED") && model.equals("Mercedes") && isExpensive) {
            message = "We need to broke it.";
        } else if (color.equals("GREEN") && model.equals("Škoda") && isExpensive) {
            message = "Try to keep it safe.";
        }
        return message;
    }

    public boolean isExpensive(int price) {
        return price >= 100_000;
    }
}