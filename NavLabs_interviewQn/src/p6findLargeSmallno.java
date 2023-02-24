public class p6findLargeSmallno {
    private static void largeSmallFinder(int[] noArray){
        int largest=noArray[0];
        int smallest=noArray[0];

        for (int x:noArray) {
            if(x>largest){
                largest=x;
            } else if (x<smallest) {
                smallest=x;
            }
        }
        System.out.println("Smallest: "+smallest+"\n"+"Largest: "+largest);
    }

    public static void main(String[] args) {
        largeSmallFinder(new int[]{4,-2,0,-8,6,7,45,-4567});
    }
}
