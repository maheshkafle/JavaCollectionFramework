package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

    public static void main(String[] args) {

        //1. Sort and then use equals() method to compare if two ArrayList are equal
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "F", "D", "E","B"));
        System.out.println("l1 -> "+l1);

        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("F", "E", "D","C","B","A"));
        System.out.println("l2 -> "+l2);

        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        System.out.println("l3 -> "+ l3);

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println("l1 equal to l2 "+l1.equals(l2));
        System.out.println("l2 equals to l3 "+l2.equals(l3));

        System.out.println("<-----------------> ");

        //2. ArrayList Comparison:  Find the additional elements comparing two ArrayLists
        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","E","F"));
        System.out.println("Before removeAll method -> "+l4);
        l4.removeAll(l5);
        System.out.println("After removeAll method -> "+l4);


        //3. ArrayList Comparison: Find the common elements comparing two ArrayLists
        ArrayList<String> pl1 = new ArrayList<String>(Arrays.asList("Python","C#","Javascript","Java", "Ruby"));
        ArrayList<String> pl2 = new ArrayList<String>(Arrays.asList("Python","C#", "Golang","Javascript","Ruby"));

        System.out.println("Before retainAll method -> "+pl2);
        pl1.removeAll(pl2);
        System.out.println("After retainAll method -> "+pl1);
    }
}
