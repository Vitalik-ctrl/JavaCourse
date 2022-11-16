package Lesson03;

public class SkyMall extends Building implements Guard, Parking {

    private int countOfStores;
    private boolean isElectricityWorks;

    public SkyMall(String company, boolean isFoundation, int area, int floor, boolean isElevator, int countOfStores, boolean isElectricityWorks) {
        super(company, isFoundation, area, floor, isElevator);
        this.countOfStores = countOfStores;
        this.isElectricityWorks = isElectricityWorks;
    }

    public SkyMall(int countOfStores, boolean isElectricityWorks) {
        this.countOfStores = countOfStores;
        this.isElectricityWorks = isElectricityWorks;
    }

    public SkyMall() {
    }

    public int getCountOfStores() {
        return countOfStores;
    }

    public void setCountOfStores(int countOfStores) {
        this.countOfStores = countOfStores;
    }

    public boolean isElectricityWorks() {
        return isElectricityWorks;
    }

    public void setElectricityWorks(boolean electricityWorks) {
        isElectricityWorks = electricityWorks;
    }

    @Override
    public boolean callGuard() {
        return !(isElevator() || isElectricityWorks());
    }

    @Override
    public boolean isParkingExist(int countOfStores) {
        return countOfStores > 50;
    }
}
