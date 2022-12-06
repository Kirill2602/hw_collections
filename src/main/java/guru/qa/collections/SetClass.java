package guru.qa.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetClass {
    Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three", "four", "five"));

    public void add(String element) {
        set.add(element);
    }

    public void remove(String name) {
        if (set.size() > 0 && set.contains(name)) {
            set.remove(name);
        } else {
            System.out.println("Здесь нет такого элемента");
        }
    }

    public void remove(int index) {
        if (set.size() > 0) {
            set.remove(index);
        } else {
            System.out.println("Здесь нечего удалять.");
        }
    }

    public void search(String value) {
        if (set.stream()
                .filter(entry -> entry.equals(value)).toList().size() != 0) {
            System.out.println("Нашелся элемент " + value);
        } else {
            System.out.println("Элемента " + value + " нет в списке");
        }
    }

    public void cycle() {
        set.forEach(System.out::println);
    }

}
