package Homework03;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat rick = new Cat("Rick", "White");
        Cat goodwin = new Cat("Goodwin", "White");
        Cat tom = new Cat("Tom", "Black");

        Dog dog = new Dog();
        Dog garry = new Dog("Garry", "Black");
        Dog richard = new Dog("Richard", "Brown");
        Dog bobbi = new Dog("Bobbi", "White");
        Dog jasper = new Dog("Jasper", "Brown");
        Dog lucky = new Dog("Lucky", "White");

        Animal duck = new Animal("Duck", "Gray");
        Animal crocodile = new Animal("Crocodile", "Green");

        Animal [] animals = {cat, rick, goodwin, tom, dog, garry, richard, bobbi, jasper, lucky, crocodile, duck};

        System.out.println("Cats -------------------------------------------");
        System.out.println(cat.run(100));
        System.out.println(cat.swim(10));
        System.out.println(rick.run(270));
        System.out.println(tom.swim(7));
        System.out.println(goodwin.run(100));
        System.out.println(goodwin.run(740));

        System.out.println("\nDogs -------------------------------------------");
        System.out.println(dog.swim(7));
        System.out.println(dog.swim(12));
        System.out.println(dog.run(620));
        System.out.println(garry.run(470));
        System.out.println(richard.swim(4));
        System.out.println(bobbi.run(700));

        System.out.println("\nTask 5 -------------------------------------------");
        System.out.println(countOfAnimals(animals));

    }

    public static String countOfAnimals(Animal [] animals) {
        int countOfDogs = 0, countOfCats = 0, unknownAnimal = 0;
        for (Animal animal: animals) {
            if (animal instanceof Dog)
                countOfDogs++;
            else if (animal instanceof Cat)
                countOfCats++;
            else
                unknownAnimal++;
        }
        String unknownAnimalString = (unknownAnimal == 0) ? "." : " and " + unknownAnimal + " unknown animals.";
        return "There are " + countOfCats + " cats, " + countOfDogs + " dogs" + unknownAnimalString;
    }

}
