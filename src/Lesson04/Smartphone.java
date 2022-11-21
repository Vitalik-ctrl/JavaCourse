package Lesson04;

public class Smartphone extends Gadget implements StepCount, ShowTime {

    private int screenSize;
    private int memoryCapacity;


    public Smartphone(String model, int batteryCapacity, String OS, int yearRelease) {
        super(model, batteryCapacity, OS, yearRelease);
    }

    public Smartphone() {
    }

    public Smartphone(String model, int batteryCapacity, String OS, int yearRelease, int screenSize, int memoryCapacity) {
        super(model, batteryCapacity, OS, yearRelease);
        this.screenSize = screenSize;
        this.memoryCapacity = memoryCapacity;
    }

    public Smartphone(int screenSize, int memoryCapacity) {
        this.screenSize = screenSize;
        this.memoryCapacity = memoryCapacity;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public int calculateStep() {
        System.out.println("Watch wasn't found");
        return 0;
    }

    @Override
    public int calculateDistance() {
        System.out.println("Watch wasn't found");
        return 0;
    }

    @Override
    public int calculateFloors() {
        System.out.println("Watch wasn't found");
        return 0;
    }

    @Override
    public int calculateStep(int startPoint, int endPoint) {
        return 0;
    }

    @Override
    public void showTime() {
        ShowTime.super.showTime();
    }

    @Override
    public void doSth() {
        super.doSth();
        System.out.println("Or...not?");
    }
}
