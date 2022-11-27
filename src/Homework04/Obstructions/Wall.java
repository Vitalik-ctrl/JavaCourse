package Homework04.Obstructions;

import Homework04.Obstructions.Obstruction;

public class Wall implements Obstruction {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double overcome() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Wall";
    }
}
