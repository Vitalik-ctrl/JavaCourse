package Lesson03;

import java.util.Objects;

public class Building {
    private String company;
    private boolean isFoundation;
    private int area;
    private int floor;
    private boolean isElevator;

    public Building(String company, boolean isFoundation, int area, int floor, boolean isElevator) {
        this.company = company;
        this.isFoundation = isFoundation;
        this.area = area;
        this.floor = floor;
        this.isElevator = isElevator;
    }

    public Building() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isFoundation() {
        return isFoundation;
    }

    public void setFoundation(boolean foundation) {
        isFoundation = foundation;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isElevator() {
        return isElevator;
    }

    public void setElevator(boolean elevator) {
        isElevator = elevator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building building)) return false;
        return isFoundation() == building.isFoundation() && getArea() == building.getArea() && getFloor() == building.getFloor() && isElevator() == building.isElevator() && getCompany().equals(building.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompany(), isFoundation(), getArea(), getFloor(), isElevator());
    }
}
