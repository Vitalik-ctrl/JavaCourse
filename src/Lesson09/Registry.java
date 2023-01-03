package Lesson09;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    List<Cafe> cafeList;

    public Registry() {
        this.cafeList = new ArrayList<>();
    }

    // add cafe to Registry
    public void add(Cafe cafe) {
        cafeList.add(cafe);
    }

    // Find cafe by name, if cafe with this name doesn't exist - throws CafeNotFoundException
    public Cafe findByName(String name) throws CafeNotFoundException {
        Cafe foundCafe = null;
        for (Cafe cafe : cafeList) {
            if (name.equals(cafe.getName())) {
                foundCafe = cafe;
                break;
            }
        }
        if (foundCafe != null) {
            return foundCafe;
        } else {
            throw new CafeNotFoundException(name);
        }
    }

    // return allCafes in Registry
    public List<Cafe> allCafes() {
        return cafeList;
    }

    // byAssortment = true -> returns all cafes with assortment,
    // byAssortment = false -> returns all cafes without assortment
    public List<Cafe> filterByAssortment(boolean byAssortment) {
        List<Cafe> filteredCafeList = new ArrayList<>();
        for (Cafe cafe : cafeList) {
            // if user want get cafes with assortment and this cafes has assortment - filter by assortment
            if (byAssortment && cafe.hasAssortment()) {
                filteredCafeList.add(cafe);
            } else if (!cafe.hasAssortment() && !byAssortment) {
                filteredCafeList.add(cafe);
            }
        }
        return filteredCafeList;
    }

    // filter all cafes by type (Cafe, Coffee shop, Restaurant) we can also filter by several types
    public List<Cafe> filterByType(List<Type> types) {
        List<Cafe> cafes = new ArrayList<>();
        for (Type type : types) {
            for (Cafe cafe : cafeList) {
                if (cafe.getType() == type) {
                    cafes.add(cafe);
                }
            }
        }
        return cafes;
    }
}
