package Lesson02;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Red", false, 4);
        Car car2 = new Car("", true, 4);
        Car car3 = new Car();

        car3.setColor("");

        System.out.println("Car 1 " + car1.getColor());
        System.out.println("Car 2 " + car2.getColor());
        System.out.println("Car 3 " + car3.getColor());
        System.out.println("--------------------------------------\n");

        car1.move(car1.getColor());
        System.out.println("--------------------------------------\n");

        System.out.println(car1.modelCar(car1.getColor(), "Mercedes", true));
        System.out.println(car2.modelCar(car2.getColor(), "BMW", false));
        System.out.println(car2.modelCar("GREEN", "Škoda", true));
        System.out.println("--------------------------------------\n");

        System.out.println("Is Car 1 expensive? " + car1.isExpensive());
        car1.setExpensive(car1.isExpensive(120_000));
        System.out.println("Is Car 1 expensive? " + car1.isExpensive());
        System.out.println("--------------------------------------\n");
    }
}