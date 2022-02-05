package Map;

import java.util.*;

public class HashMapToArrayList {

    public static void main(String[] args) {

        HashMap<String, Integer> companyMap = new HashMap<String, Integer>();
        companyMap.put("Meta", 10000);
        companyMap.put("Amazon", 5000);
        companyMap.put("Apple", 7000);
        companyMap.put("Microsoft", 8000);
        companyMap.put("Google", 15000);

        Iterator itr = companyMap.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry pairs = (Map.Entry)itr.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }

        System.out.println("-----------------------------");

        //Convert HashMap into ArrayList
        List<String> companyNameList = new ArrayList<String>(companyMap.keySet());
        System.out.println("Total Companies = "+companyNameList.size());
        for (String t : companyNameList){
            System.out.println(t);
        }

        List<Integer> employeeCountList = new ArrayList<Integer>(companyMap.values());
        System.out.println("Total employee count = "+ employeeCountList.size());
        for (Integer i : employeeCountList){
            System.out.println(i);
        }
    }
}
