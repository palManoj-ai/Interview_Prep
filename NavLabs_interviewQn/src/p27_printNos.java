public class p27_printNos {
    //WAP to print numbers from 1-100 wo using any numbers
    public static void main(String[] args) {
        int i = 'A' / 'A';   //so that it is 1
        String times = "aaaaaaaaaa"; //so that length is 10
        for (int j = i; j <= (times.length()*times.length()); j+=i) {
            //can also use j<='d' as asci value of d is 100
            System.out.println(j);
        }
    }
}
