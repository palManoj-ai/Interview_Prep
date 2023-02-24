import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class p22_findduplicatewords {
    //wap to find duplicate words in a string

    private static Map<String,Integer> findDuplicateWords(String str){

        str=str.replaceAll("[^ a-zA-Z0-9]","").toLowerCase();
        //to lowercase for case-insensitive
        String[] strArray=str.split(" ");
        Map<String,Integer> map=new HashMap<String, Integer>();
        for(String entry:strArray){
            if(!map.containsKey(entry)){
                map.put(entry,1);
            }else{
                map.put(entry,map.get(entry)+1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        String testString="Hello hello there, I am Manoj Manoj Manoj.";
        System.out.println("Printing words that have count more than one: ");
        Map<String,Integer> opMap=findDuplicateWords(testString);
        for(Map.Entry<String,Integer> entry: opMap.entrySet()){
            if(entry.getValue()>1){  //condition to only print words with count>1
                System.out.println("Word \" "+entry.getKey()+" \" count: "+entry.getValue());
            }
        }
    }
}


