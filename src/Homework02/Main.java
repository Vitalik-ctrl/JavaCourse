package Homework02;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Employee employee = new Employee("vitalii", "varhanik", 18,
                "Java Developer", "", "");

        String [] emailTestData = {"vitvarganik@gmail.com", "vit.va@rganik@gmail.com",
                "vit.varganik@google.odessa.ua", "vit-varganik.com"};
        String [] phoneNumberTestData = {"+38(063)0250247", "+38(163)0250247",
                "38(063)0250247", "+38(063)02502471"};

        for (String email: emailTestData) {
            employee.setEmail(email);
            System.out.println(employee.getEmail()+"\n-----------------");
        }

        for (String phoneNumber: phoneNumberTestData) {
            employee.setPhoneNumber(phoneNumber);
            System.out.println(employee.getPhoneNumber()+"\n-----------------");
        }

        System.out.println(employee.getFirstName() +" "+ employee.getLastName());
   //     car.start();
    }
}
