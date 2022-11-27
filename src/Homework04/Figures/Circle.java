package Homework04.Figures;

import Homework04.Figures.Area;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.radius * Math.pow(Area.PI, 2);
    }
}
