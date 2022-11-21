package Lesson04;

public class Gadget {
    private String model;
    private int batteryCapacity;
    private String OS;
    private int yearRelease;

    public Gadget(String model, int batteryCapacity, String OS, int yearRelease) {
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.yearRelease = yearRelease;
    }

    public Gadget() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void powerUp() {}

    public void doSth() {
        System.out.println("Bye!");
    }
}
