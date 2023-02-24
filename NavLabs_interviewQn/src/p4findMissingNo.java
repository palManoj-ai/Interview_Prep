public class p4findMissingNo {
    private static String finder(int[] testArray,int[] numberArray){
        int lenTestArray=testArray.length;
        int sumTestArray=0;
        int lenNumberArray=numberArray.length;
        int sumNumberArray=0;
        int missingNumber=0;
        for (int i = 0; i < lenNumberArray; i++) {
            sumNumberArray+=numberArray[i];
        }
        for (int j = 0; j < lenTestArray; j++) {
            sumTestArray+=testArray[j];
        }
        missingNumber=sumNumberArray-sumTestArray;
        return ("The missing number is:"+missingNumber);
    }

    public static void main(String[] args) {
        int[] ary1=new int[]{4,6,2,4,9};
        int[] ary2=new int[]{4,6,2,9};
        System.out.println(finder(ary2,ary1));
    }
}
