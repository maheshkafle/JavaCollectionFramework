package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> studentName = new ArrayList<String>();

        studentName.add("Mahesh");
        studentName.add("Madan");
        studentName.add("Sakshyam");
        studentName.add("Susma");

        //For Loop
        for (int i =0; i<studentName.size(); i++){
            System.out.println(studentName.get(i));
        }

        System.out.println("------------");

        //For Each Loop
        for (String s: studentName){
            System.out.println(s);
        }

        System.out.println("------------");

        //JDK 8 -> Streams with Lambda
        studentName.stream().forEach(ele -> System.out.println(ele));

        System.out.println("------------");

        //Iterator
        Iterator<String> it = studentName.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
