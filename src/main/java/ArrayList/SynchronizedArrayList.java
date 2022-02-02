package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        //Method1. Collections.synchronizedList
        List<String> candidateList1 = Collections.synchronizedList(new ArrayList<String>());

        //Note: We don't need any synchronized keyword to add or remove element from ArrayList
        candidateList1.add("Mahesh");
        candidateList1.add("Madan");
        candidateList1.add("Susma");

        //Note: We need explicit synchronization in order to traverse/fetch the data from ArrayList
        synchronized (candidateList1) {

            Iterator<String> itr1 = candidateList1.iterator();
            while (itr1.hasNext()){
                System.out.println(itr1.next());
            }
        }

        System.out.println("----------------");

        //Method2: copyOnWriteArrayList -- its a class
        CopyOnWriteArrayList<String> candidateList2 = new CopyOnWriteArrayList<String>();

        candidateList2.add("Prakash");
        candidateList2.add("Suraksha");
        candidateList2.add("Abhinav");
        candidateList2.add("Birbal");

        //Note: we don't need explicit synchronization for any operation: add/remove/traverse
        Iterator<String> itr2 = candidateList2.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
