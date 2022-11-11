package Homework02;

public class Car {
    public void start() {
        this.startElectricity();
        this.startCommand();
        this.startFuelSystem();
    }

    private String startElectricity() {
        return "Start electricity";
    }

    private String startCommand() {
        return "Start command";
    }

    private String startFuelSystem() {
        return "Start fuel system";
    }
}
