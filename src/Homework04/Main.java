package Homework04;

import Homework04.Figures.Area;
import Homework04.Figures.Circle;
import Homework04.Figures.Square;
import Homework04.Figures.Triangle;
import Homework04.Obstructions.Obstruction;
import Homework04.Obstructions.Track;
import Homework04.Obstructions.Wall;
import Homework04.Users.Cat;
import Homework04.Users.Human;
import Homework04.Users.Robot;
import Homework04.Users.User;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(1);
        Triangle triangle = new Triangle(1, 14);
        Circle circle = new Circle(1);

        Area[] shapes = {square, triangle, circle};
        System.out.println("Area of all shapes is " + sum(shapes));

        Human human = new Human(170, 1.2);
        Cat cat = new Cat(40, 0.7);
        Robot robot = new Robot(300, 4.2);

        Track track = new Track(30);
        Wall wall = new Wall(2);
        Track track1 = new Track(120);
        Wall wall1 = new Wall(0.5);

        User[] participants = {human, cat, robot};
        Obstruction[] obstructions = {track, track1, wall, wall1};

        for (User participant : participants) {
            System.out.println("------------------------");
            participant.overcomeObstructions(obstructions);
        }
    }

    static double sum(Area[] shapes) {
        double result = 0;
        for (Area shape : shapes) {
            result += shape.calculateArea();
        }
        return result;
    }

}
