import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p5findDuplicate {
    //WAP to find duplicates in an array

    private static void duplicateFinder(String[] strArray) {

        //1 double for loop: O(n squared) time complexity
//        for (int i = 0; i < strArray.length; i++) {
//            for (int j = i + 1; j < strArray.length; j++) {
//                if (strArray[j].equals(strArray[i])) {
//                    System.out.println("Duplicate element is: " + strArray[i]);
//                }
//            }
//        }
//    }

        //2 Using sets O(n)
//        Set<String> strSet = new HashSet<String>();
//        for (String str : strArray) {
//            if (strSet.add(str)==false) {   //or   !(strSet.add(str))
//                System.out.println("Method 2: Duplicate element is: " + str);
//            }
//        }
//    }

        //3 Using hashmaps (property of keys and values)  O(2n)
        Map<String, Integer> strMap = new HashMap<String, Integer>();

        for (String str : strArray) {
            Integer count = strMap.get(str);
            if ( count== null) {
                strMap.put(str, 1);
            } else {
                strMap.put(str, ++count);
            }
        }

        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Method 3 Duplicate element is: " + entry.getKey()+" which is present "+entry.getValue()+" times.");
            }
        }
    }


    public static void main(String[] args) {
        String[] testStrArray = new String[]{"Manoj", "Sophie", "Clara", "John","Clara","Sophie","Sophie"};
        duplicateFinder(testStrArray);

    }
}
