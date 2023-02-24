import java.util.HashMap;
import java.util.Map;

public class p5IntegerCounter {
    private static void integerCounter(int[] noArray){
        Map<String,Integer> intMap=new HashMap<String,Integer>();


        for (Integer no:noArray ) {
            Integer count=intMap.get(no.toString());
            if(count==null){
                intMap.put(no.toString(),1);
            }else{
                intMap.put(no.toString(),++count);
            }
        }

        for(Map.Entry<String,Integer> entry:intMap.entrySet()){
            System.out.println("Number "+entry.getKey()+" is present "+entry.getValue()+" times.");
        }
    }

    public static void main(String[] args) {
        int[] testArray=new int[]{4,7,2,4,9,0,7,7,3};
        integerCounter(testArray);
    }
}
