package guru.qa;

import guru.qa.collections.ListClass;
import guru.qa.collections.MapClass;
import guru.qa.collections.SetClass;

public class Main {
    public static void main(String[] args) {
//++++++++++++++ LIST +++++++++++++++++++++++
        ListClass list = new ListClass();
        //Add
        list.add("Cherry");
        list.add("Orange");
        list.add("Apple");
        list.add("Melon");
        list.add("WaterMelon");
        list.add("Banana");

        //Cycle
        list.cycle();
        System.out.println("+++++++++++++++++++++++++++++++");
        //Remove by name
        list.remove("Banana");

        //Remove by index
        list.remove(0);

        //Check after removing
        list.cycle();

        //Search
        list.search("Melon");
        list.search("Cherry");

//++++++++++++++++++++++++++++ SET +++++++++++++++++++++++++++++++
        System.out.println("################ SET ###################");
        SetClass set = new SetClass();

        //add
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        //cycle
        set.cycle();
        //Remove by name
        set.remove("two");

        //Remove by index
        set.remove(0);

        //Check after removing
        set.cycle();

        set.search("five");
        set.search("six");

        System.out.println("######################## MAP ########################");
        MapClass map = new MapClass();

        //add
        map.add("1", "one");
        map.add("2", "two");
        map.add("3", "three");
        map.add("4", "four");
        map.add("5", "five");
        map.add("6", "six");

        //cycle
        map.cycle();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //remove by key + value
        map.remove("1", "one");
        //remove by key
        map.remove("3");

        //check after removing
        map.cycle();
        //search
        map.search("2");
        map.search("3");
    }
}