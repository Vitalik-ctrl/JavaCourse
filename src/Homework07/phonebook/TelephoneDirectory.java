package Homework07.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private List<Record> phoneBook;

    public TelephoneDirectory() {
        this.phoneBook = new ArrayList<Record>();
    }

    public void add(Record record) {
        phoneBook.add(record);
    }

    public Record find(String name) {
        for (Record record : phoneBook) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> records = new ArrayList<Record>();
        for (Record record : phoneBook) {
            if (record.getName().equals(name)) {
                records.add(record);
            }
        }
        return records;
    }
}
