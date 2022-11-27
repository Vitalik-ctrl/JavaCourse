package Homework04.Obstructions;

import Homework04.Obstructions.Obstruction;

public class Track implements Obstruction {

    private double length;

    public Track(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double overcome() {
        return this.length;
    }

    @Override
    public String toString() {
        return "Track";
    }
}
