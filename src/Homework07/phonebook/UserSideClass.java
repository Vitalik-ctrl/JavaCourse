package Homework07.phonebook;

import java.util.List;

public class UserSideClass {
    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.add(new Record("John Smith", "123-456-7890"));
        directory.add(new Record("Jane Smith", "123-456-7891"));
        directory.add(new Record("John Smith", "123-456-7892"));

        Record record = directory.find("John Smith");
        System.out.println(record.getPhone());  // prints "123-456-7890"

        List<Record> records = directory.findAll("John Smith");
        for (Record r : records) {
            System.out.println(r.getPhone());  // prints "123-456-7890" and "123-456-7892"
        }
    }
}
