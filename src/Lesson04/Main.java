package Lesson04;

public class Main {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();
        Smartphone smartphone = new Smartphone("iPhone", 4200, "IOS", 2022);
        smartphone.showTime();
        smartphone.calculateDistance();

        Gadget samsung = new Smartphone("Samsung", 5000, "Android", 2017);
        ShowTime showTime = new Smartphone("Samsung", 5000, "Android", 2017);
        showTime.showTime();

        SmartWatch watches = new SmartWatch(1, "K", true);
        watches.showInfo(20);
        samsung.doSth();


    }
}