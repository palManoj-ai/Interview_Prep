public class p19_Factorial {
    //using recursive method
    public static int factorialOf(int num){
        if(num==1||num==0) {
            return 1;
        } else{
                return (num * factorialOf(num - 1));
            }
    }

    public static void main(String[] args) {
        System.out.println(factorialOf(5));
        System.out.println(factorialOf(0));
        System.out.println(factorialOf(1));
        System.out.println(factorialOf(2));
    }

}
