package Homework02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car();
        Employee employee = new Employee("Vitalii", "Varhanik", 18,
                "Java Developer", "+380630250247", "vitvarganik@gmail.com");
        System.out.println(employee.toString());

    }
}
