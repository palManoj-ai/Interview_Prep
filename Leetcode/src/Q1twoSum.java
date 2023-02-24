import java.util.HashMap;
import java.util.Map;
/*
{3,5,7,2,4} target=5, so op ={0,3} or {3,0}
 */

public class Q1twoSum {
//    https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] numArray, int target) {

        Map<Integer,Integer> complements=new HashMap<Integer,Integer>();
        int[] sol=new int[2];
        for(int i=0;i<numArray.length;i++){
            if(complements.get(numArray[i])==null){
                complements.put(target-numArray[i],i);
            } else{
                sol[0]=complements.get(numArray[i]);
                sol[1]=i;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int t_target=7;
        int[] t_array=new int[]{2,4,5,0,1};
        Q1twoSum mn1=new Q1twoSum();
        System.out.println(mn1.twoSum(t_array,t_target));
    }
}