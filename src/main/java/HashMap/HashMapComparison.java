package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {

    public static void main(String[] args) {

        //1. Comparison on the basis of Key-Value pair: use equals method:
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        hmap1.put(1,"A");
        hmap1.put(2,"B");
        hmap1.put(3,"C");

        HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
        hmap2.put(3, "C");
        hmap2.put(1, "A");
        hmap2.put(2, "B");

        HashMap<Integer, String> hmap3 = new HashMap<Integer, String>();
        hmap3.put(1, "A");
        hmap3.put(2, "B");
        hmap3.put(3, "C");
        hmap3.put(3, "D");

        System.out.println(hmap1.equals(hmap2));
        System.out.println(hmap1.equals(hmap3));

        System.out.println("----------------------------------");

        //2. compare HashMaps for same keys: keyset()
        System.out.println(hmap1.keySet().equals(hmap2.keySet()));
        System.out.println(hmap2.keySet().equals(hmap3.keySet()));

        System.out.println("----------------------------------");

        //3. Imp Interview Question: Find the extra key in the HashMap.
        HashMap<Integer, String> hmap4 = new HashMap<Integer, String>();
        hmap4.put(1, "A");
        hmap4.put(2, "B");
        hmap4.put(3, "C");
        hmap4.put(4, "D");

        HashSet<Integer> combineKeys = new HashSet<>(hmap1.keySet());
        //add the keyset from hmap4
        combineKeys.addAll(hmap4.keySet());
        combineKeys.removeAll(hmap1.keySet());
        System.out.println(combineKeys);

        //4. Comparison on the basis of Values: use ArrayList and HashSet:
        HashMap<Integer, String> hmap5 = new HashMap<Integer, String>();
        hmap5.put(1,"A");
        hmap5.put(2,"B");
        hmap5.put(3,"C");

        HashMap<Integer, String> hmap6 = new HashMap<Integer, String>();
        hmap6.put(1,"A");
        hmap6.put(2,"B");
        hmap6.put(3,"C");

        HashMap<Integer, String> hmap7 = new HashMap<Integer, String>();
        hmap7.put(1, "A");
        hmap7.put(2, "B");
        hmap7.put(3, "C");
        hmap7.put(4, "C");

        //a. duplicates are not allowed: using ArrayList
        System.out.println(new ArrayList<>(hmap5.values()).equals(new ArrayList<>(hmap6.values())));//true
        System.out.println(new ArrayList<>(hmap5.values()).equals(new ArrayList<>(hmap7.values())));//false

        //a. duplicates are not allowed: using ArrayList
        System.out.println(new HashSet<>(hmap5.values()).equals(new HashSet<>(hmap6.values())));//true
        System.out.println(new HashSet<>(hmap5.values()).equals(new HashSet<>(hmap7.values())));//true
    }
}
