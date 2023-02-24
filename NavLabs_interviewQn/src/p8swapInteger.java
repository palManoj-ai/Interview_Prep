public class p8swapInteger {
    public static void main(String[] args) {
        int x = 5, y = 7;   //declaring values

        //1. using temp or third variable
        int temp=x;
        x=y;
        y=temp;
        System.out.println("Method 1: x is : "+ x+" and y is "+y);

        //2. Using operators + or *
        int a=7;
        int b=5;
        a=a+b;     //or a*b
        b=a-b;     // or a/b
        a=a-b;     // or a/b
        System.out.println("Method 2: a is : "+ a+" and b is "+b);

        //3 using bitwise operator xor ^
        // bitwise XOR
        // 0101 ^ 0111 = 0101 = 2
        //// Performing an operation with xor and traditional operator
        //        System.out.println("x ^ y = " + (x ^ y));

        int m=4;  //in binary 100
        int n=5;  //in binary 101

        m=m^n;    // m xor n, binary, 110=6
        n=m^n;    // 110 xor 101=100=4
        m=m^n;    //110 xor 100=101=5 so the values are reverserd
        System.out.println("m is "+m+" and n is "+n);

    }
}
