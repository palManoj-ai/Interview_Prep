import java.util.Arrays;
import java.util.Optional;

public class Q4_longPrefix {

    //["flower","flow","flight"] > op "fl"
    //Method 1:
    // 1: Sort arrays so that words are alphabetically arranged, first word and last word are most dissimilar
    // 2:
    public static String  longestPrefixFinder(String[] strArray) {
        Arrays.sort(strArray);
        String first = strArray[0];
        String last=strArray[strArray.length-1];
        int c=0;
        while(c< first.length()){
            if(first.charAt(c)==last.charAt(c)){
                c++;
            }else{
                break;
            }
    }
        return (c == 0 ? "" : first.substring(0, c));
    }
    public static void main(String[] args) {
        String[] testArray=new String[]{"flower","flow","flight"};
        String[] testArray2=new String[]{"aaaa","ax","abc"};

        System.out.println(longestPrefixFinder(testArray2));


    }


}
