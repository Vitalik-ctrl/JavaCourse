package Homework02;

import java.util.regex.*;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private String phoneNumber;
    private String email;

    public Employee(String firstName, String lastName, int age, String position, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 122) {
            this.age = age;
        }
        this.age = 18;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (Pattern.matches("\\+38\\(0\\d{2}\\)\\d{7}", phoneNumber)) {
            this.phoneNumber = phoneNumber;
            return;
        }
        this.phoneNumber = "unidentified";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Pattern.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w+)*", email)) {
            this.email = email;
            return;
        }
        this.email = "unidentified";
    }
}

