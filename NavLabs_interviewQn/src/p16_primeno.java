public class p16_primeno {
    public static boolean isPrimeNumber(int no) {
        if(no<=1){
            return false;
        }
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getPrimeNumbers(int num){
        for(int j=2;j<=num;j++){
            if(isPrimeNumber(j)){
                System.out.print(j+" ");
            }
        }

    }
    public static void main(String[] args) {
        //Prime no is divisible by 1 and the no itself, only even prime no is 2
        //eg 5,7,13,11,17,19,23
        //test cases: lowest and largest, out of range, datamismatch (char instead of int)
        System.out.println(isPrimeNumber(-5));  //false
        System.out.println(isPrimeNumber(0));   //false
        System.out.println(isPrimeNumber(1));   //false
        System.out.println(isPrimeNumber(5));   //true
        System.out.println(isPrimeNumber(123));  //false
        System.out.println(isPrimeNumber(2));    //true

        System.out.println("*******************************");
        getPrimeNumbers(10);
    }
}
