package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> duplicateNum1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,4,5,6));
        System.out.println("Duplicate Numbers 1-> "+duplicateNum1);

        //Method 1: Using LinkedHashSet
        LinkedHashSet<Integer> distinctNum1 = new LinkedHashSet<Integer>(duplicateNum1);

        System.out.println("Distinct Numbers 1 using LinkedHashSet -> "+distinctNum1);

        System.out.println("------------------");
        //Method 2: JDK8 - Stream
        ArrayList<Integer> duplicateNum2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,4,5,6));
        System.out.println("Duplicate Numbers 2-> "+duplicateNum1);

        List<Integer> distinctNum2 = duplicateNum2.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Numbers 2 using JDK8 - Stream -> "+distinctNum2);

    }
}
