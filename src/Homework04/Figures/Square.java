package Homework04.Figures;

import Homework04.Figures.Area;

public class Square implements Area {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2);
    }
}
