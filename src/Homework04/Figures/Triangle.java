package Homework04.Figures;

public class Triangle implements Area {

    private double side;
    private double heightToSide;

    public Triangle(double side, double heightToSide) {
        this.side = side;
        this.heightToSide = heightToSide;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeightToSide() {
        return heightToSide;
    }

    public void setHeightToSide(double heightToSide) {
        this.heightToSide = heightToSide;
    }

    @Override
    public double calculateArea() {
        return this.side * this.heightToSide * 0.5;
    }
}
