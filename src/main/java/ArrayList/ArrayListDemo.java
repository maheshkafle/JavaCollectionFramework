package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {

         ArrayList ar = new ArrayList();

         ar.add("a");
         ar.add(('A'));
         ar.add(12);

        System.out.println(ar);
        System.out.println("-----");
        System.out.println(ar.get(2));
//        System.out.println(ar.get(3));
        System.out.println("Lowest Index - " + 0);
        System.out.println("Highest Index - " + (ar.size() -1));

        //List with other Collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(numbers);
    }
}
