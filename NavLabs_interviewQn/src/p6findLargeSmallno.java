import java.sql.SQLOutput;
import java.util.Arrays;

public class p6findLargeSmallno {
    private static void largeSmallFinder(int[] noArray){
        /*int largest=noArray[0];
        int smallest=noArray[0];

        for (int x:noArray) {
            if(x>largest){
                largest=x;
            } else if (x<smallest) {
                smallest=x;
            }
        }
        System.out.println("Smallest: "+smallest+"\n"+"Largest: "+largest);*/

        //Method 2: or could use Arrays.sort() and first and last element
        Arrays.sort(noArray);
        System.out.println("Smallest: "+noArray[0]+" Largest: "+noArray[noArray.length-1]);
    }

    public static void main(String[] args) {

        largeSmallFinder(new int[]{4,-2,0,-8,6,7,45,-4567});
    }
}
