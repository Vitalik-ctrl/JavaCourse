package Lesson03;

public class Main {
    public static void main(String[] args) {

        Depo depo = new Depo();
        System.out.println(depo.isClosed(3));

        SkyMall skyMall = new SkyMall();
        skyMall.setElectricityWorks(true);
        skyMall.setElevator(true);
        System.out.println(skyMall.callGuard());

        skyMall.setElectricityWorks(false);
        skyMall.setElevator(true);
        System.out.println(skyMall.callGuard());

    }
}
