package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethodDemo {

    public static void main(String[] args) {

        ArrayList<String> pllist = new ArrayList<String>();
        pllist.add("Java");
        pllist.add("Python");
        pllist.add("ruby");
        pllist.add("Golang");
        System.out.println("Programming Language list -> "+pllist);

        ArrayList<String> domainlist = new ArrayList<String>();
        domainlist.add("Testing");
        domainlist.add("Dev ops");
        System.out.println("IT Domain -> " + domainlist);
//        System.out.println("------");

        //addAll Method
//        pllist.addAll(domainlist);

        //JDK8: streams with lambda
//        pllist.stream().forEach(ele -> System.out.println(ele));

        //clear() : clears the entire arrayList
//        pllist.clear();
//        System.out.println(pllist);

        //clone() method
        ArrayList<String> clonedList = (ArrayList<String>)pllist.clone();
        //Foreach Loop
        System.out.println("--Cloned List--");
        for (String s: clonedList) {
            System.out.println(s);
        }

        //contains(): used to check particular element is present in Arraylist and it returns the boolean result
        System.out.println(pllist.contains("Python")); //true
        System.out.println(pllist.contains("C++")); //false

        //indexOf(): returns the index of particular element from ArrayList
        System.out.println(pllist.indexOf("ruby"));

        //lastIndexOf(): returns the last index of particular element from Arraylist
        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Mahesh", "Orange","Likes","Orange","Madan","Mahesh","Orange"));
        System.out.println(newList.lastIndexOf("Orange"));
        System.out.println(newList.lastIndexOf("Mahesh"));

        //remove(): removes element from particular index
        System.out.println("Before remove method -> "+newList);
        //newList.remove(2);
        newList.remove("Likes");
        System.out.println("After remove method -> " + newList);

        //removeIf(): removes all the elements if condition is met true
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //remove all elements which is divisible by 2 or even numbers
        System.out.println("Before removeIf method -> " +intList);
        intList.removeIf(ele -> ele%2 == 0);
        System.out.println("After removeIf method -> "+ intList);

        //retainAll(): preserves particular element in ArrayList based on value that you passed using singleton method
        ArrayList<String> studentName = new ArrayList<String>(Arrays.asList("Mahesh", "Dipak","Ramesh","Mahesh","Narayan","Ghanu"));
        System.out.println("Before retaining value -> "+ studentName);
        studentName.retainAll(Collections.singleton("Mahesh"));
        System.out.println("After retaining value -> "+ studentName);

        //sublist(): create entirely new ArrayList passing start and end index value
        ArrayList<Integer> primeNum = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11, 13, 17, 19));
        ArrayList<Integer> sublist = new ArrayList<Integer>(primeNum.subList(0, 3));
        System.out.println("Sublist start from 0th index and goes upto 2nd index -> "+sublist);

        ArrayList<String> candidateName = new ArrayList<String>(Arrays.asList("Mahesh", "Dipak","Ramesh","Mahesh","Narayan","Ghanu"));
        //toArray(): this method returns single Dimensional Object Array
        Object arr[] = newList.toArray();

        for (Object o: arr){
            System.out.println(o);
        }

    }
}
