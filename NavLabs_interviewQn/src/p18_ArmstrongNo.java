public class p18_ArmstrongNo {
    //An Armstrong number or  narcissistic no is a number such that the sum
    // of its digits raised to the power of its no of digits is equal to the number itself.
    // For example, 371 is an Armstrong number, since 3**3 + 7**3 + 1**3 = 371.
    // dfddddf

    public static boolean isArmstrongNumber(int num){
        int operatedNo=0;
        int rem=0;
        int len=Integer.toString(num).length();  //find the no of digits in a number
        int temp=num;
        while(temp>0){
            rem=temp%10;
            operatedNo=operatedNo+(int)(Math.pow(rem,len));
            temp=temp/10;
        }
        return (operatedNo==num);
    }

    public static void armstrongNumberGenerator(int number){
        for(int i=0;i<=number;i++){
            if(isArmstrongNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(4));

        System.out.println("******************");
        armstrongNumberGenerator(200);
    }

}
