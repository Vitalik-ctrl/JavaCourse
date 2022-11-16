package Lesson03;

public class Depo extends Building {

    private String address;
    private int countOfTrains;

    public Depo(String company, boolean isFoundation, int area, int floor, boolean isElevator, String address, int countOfTrains) {
        super(company, isFoundation, area, floor, isElevator);
        this.address = address;
        this.countOfTrains = countOfTrains;
    }

    public Depo() {

    }

    public boolean isClosed(int countOfTrains) {
        return countOfTrains == 0;
    }

}
