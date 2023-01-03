package Lesson09;

public class CafeNotFoundException extends Exception {
    String cafeName;

    public CafeNotFoundException(String cafeName) {
        super(cafeName + " was not found.");
        this.cafeName = cafeName;
    }
}