package Lesson04;

import java.time.LocalDate;

public interface ShowTime {

    default void showTime() {
        System.out.println(LocalDate.now());
    }
}
