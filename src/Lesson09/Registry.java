package Lesson09;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Registry {

    List<Cafe> cafeList;

    public Registry() {
        this.cafeList = new ArrayList<>();
    }

    public void add(Cafe cafe) {
        cafeList.add(cafe);
    }

    public Cafe findByName(String name) throws CafeNotFoundException {
        try {
            return cafeList.stream()
                    .filter(p -> p.getName().equals(name))
                    .findAny()
                    .get();
        } catch (NoSuchElementException e) {
            throw new CafeNotFoundException(name);
        }
    }

    public List<Cafe> allCafes() {
        return cafeList;
    }

    public List<Cafe> filterByAssortment() {
        return cafeList.stream()
                .filter(cafe -> cafe.getAssortment() != 0)
                .collect(Collectors.toList());
    }

    public List<Cafe> filterByType(Type type) {
        return cafeList.stream()
                .filter(cafe -> cafe.getType().equals(type))
                .collect(Collectors.toList());
    }
}
