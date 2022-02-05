package Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CreateHashMap {

    //Method 2. static way: HashMap
    public static Map<String, Integer> marksMap = new HashMap<>();

    static {
        marksMap.put("A",123);
        marksMap.put("B",234);
    }

    public static void main(String[] args) {

        //Method 1. Using HashMap Class
        HashMap<String, String> hmap = new HashMap<>();
        Map<String, String> hmap2 = new HashMap<>(); // Map is parent class and HashMap is a child class.

        //Method 2. Not Recommended to use but important from Interview POV: static way-> static HashMap
        System.out.println(CreateHashMap.marksMap.get("A"));

        System.out.println("--------------------------");

        //Method 3: Immutable Map with only one single entry
        Map<String, Integer> map3 = Collections.singletonMap("test",100);
        System.out.println(map3.get("test"));

        //Method 4: JDK 8
        //Creating one 2D Array of Strings using Stream and collecting in the form of Map
        Map<String, String> map4 = Stream.of(new String[][]{
            {"Mahesh", "A Grade"},
            {"Madan", "A+ Grade"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map4.get("Mahesh"));
        map4.put("Lisa", "A++ Grade");
        System.out.println(map4.get("Lisa"));

        //Method 5: using SimpleEntry
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("Mahesh", "Java"),
                new AbstractMap.SimpleEntry<>("Suraj", "Javascript")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map5.get("Mahesh"));
        map5.put("Saksham", "C#");
        System.out.println(map5.get("Saksham"));

    }
}
