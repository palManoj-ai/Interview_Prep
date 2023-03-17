public class SumOfDigits {

    static int sumOfDigits(int n){
        //returns sum of digits eg 505=10
        if(n%10==n){
            return n;
        }
        return (n%10)+sumOfDigits((n/10));
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(456));
    }
}