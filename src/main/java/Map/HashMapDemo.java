package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //No order - no indexing
        //stores values in -- Key, value pair <k,v>
        //key cannot be duplicate
        //can store 'n' number of null values but only one null value
        //HashMap is not 'ThreadSafe' - unsynchronized

        HashMap<String, String> cityMap = new HashMap<String, String>();
        cityMap.put("Nepal","Kathmandu");
        cityMap.put("India", "New Delhi");
        cityMap.put("USA","Washington DC");
        cityMap.put("Canada", "Montreal");
        cityMap.put(null,"Berlin");
        cityMap.put(null, "Tokyo");
        cityMap.put("Russia", null);
        cityMap.put("France", null);
        cityMap.remove("France");


        System.out.println(cityMap.get("USA"));
        System.out.println(cityMap.get("Canada"));

        System.out.println(cityMap.get(null));//Note: Berlin because null key is overwritten by Tokyo value instead of Berlin
        System.out.println(cityMap.get("France"));

        System.out.println("-------------------------------");

        //iterator: over the keys: by using keySet()
        Iterator<String> itr = cityMap.keySet().iterator();

        while (itr.hasNext()){
            String key = itr.next();
            String value = cityMap.get(key);
            System.out.println("Key1: "+key+"\nValue1: "+value);
        }

        System.out.println("-------------------------------");

        //iterator: over the set (pair): by using entrySet
        Iterator<Map.Entry<String, String>> itr2 = cityMap.entrySet().iterator();

        while (itr2.hasNext()){
            Map.Entry<String, String> entry = itr2.next();
            System.out.println("Key2 = "+ entry.getKey()+"\nValue2 = "+entry.getValue());

        }

    }
}
