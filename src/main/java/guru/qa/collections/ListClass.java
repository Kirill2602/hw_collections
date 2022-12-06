package guru.qa.collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    List<String> list = new ArrayList<>();

    public void add(String element) {
        list.add(element);
    }

    public void remove(String name) {
        if (list.size() > 0 && list.contains(name)) {
            list.remove(name);
        } else {
            System.out.println("Здесь нет такого элемента");
        }
    }

    public void remove(int index) {
        if (list.size() > 0) {
            list.remove(index);
        } else {
            System.out.println("Здесь нечего удалять.");
        }
    }

    public void search(String value) {
        if (list.stream()
                .filter(entry -> entry.equals(value)).toList().size() != 0) {
            System.out.println("Нашелся элемент " + value);
        } else {
            System.out.println("Элемента " + value + " нет в списке");
        }
    }

    public void cycle() {
        list.stream().forEach(System.out::println);
    }
}
