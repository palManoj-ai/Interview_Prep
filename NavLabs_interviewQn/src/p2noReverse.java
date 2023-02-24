public class p2noReverse {
    //WAP to reverse an integer
    private static int reverser(int number){
        int reversed=0;
//        int rem=0;
//        while(number!=0){    //using >0 makes the program not work for -ve integers
//            rem=number%10;
//            reversed=reversed*10+rem;
//            number=number/10;
//        }

        //convert to string, reverse, and parse
        String noString=Integer.toString(number);
        StringBuilder str=new StringBuilder(noString).reverse();
        String revno=str.toString();
        reversed=Integer.parseInt(revno);
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverser(4589));
    }
}
