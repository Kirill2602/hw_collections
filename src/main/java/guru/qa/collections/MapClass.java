package guru.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    Map<String, String> map = new HashMap<>();

    public void add(String key, String value) {
        map.put(key, value);
    }

    public void remove(String key, String value) {
        map.remove(key, value);
    }


    public void remove(String key) {
        map.remove(key);
    }

    public void cycle() {
        map.entrySet().forEach(System.out::println);
    }

    public void search(String key) {
        if (map.containsKey(key)) {
            System.out.println("Элемент по ключу " + key + " найден");
        } else {
            System.out.println("Элемент по ключу " + key + " не найден");
        }
    }
}
