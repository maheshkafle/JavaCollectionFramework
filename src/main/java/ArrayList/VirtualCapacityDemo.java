package ArrayList;

import java.util.ArrayList;

public class VirtualCapacityDemo {

    public static void main(String[] args) {

        ArrayList<Object> ar = new ArrayList<Object>();

        System.out.println(ar.size());
        ar.add(100);
        System.out.println(ar.size());
        ar.add(200);
        ar.add(300);
        ar.add(400);

        System.out.println(ar.size());

        //If we  arrayList with specific DataType e.g student Marks List, studentName list, student Percentage List and so on.
        ArrayList<Integer> intAr = new ArrayList<Integer>();
        ArrayList<String> stringAr = new ArrayList<String>();
        ArrayList<Double> doubleAr = new ArrayList<Double>();

        intAr.add(20);
        intAr.add(30);
        stringAr.add("Mahesh");
        doubleAr.add(13.33);
        doubleAr.add(15.55);

        System.out.println("intAr - "+ intAr);
        System.out.println("stringAr - "+ stringAr);
        System.out.println("doubleAr - "+ doubleAr);


    }
}
