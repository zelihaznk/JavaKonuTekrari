package _26_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ParametricDemo <T>{

    private List<T> listItem = new ArrayList();

    public void add(T item) {
        listItem.add(item);
    }

    public T get(int index) {
        return listItem.get(index);
    }
}
