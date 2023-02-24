public class p17_PalindromeNo {
    //palindrome no are 151, 34543, 222
    //hint find reverse and check if they are equal

    public static boolean isPalindrome(int num){
        int rem=0;
        int reverse=0;
        int temp=num;
        //first find reverse
        while(temp>0){
                rem=temp%10;
                reverse=reverse*10+rem;
                temp=temp/10;
        }
        System.out.println("reversed no is "+reverse);
        return (reverse==num);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(151));
        System.out.println(isPalindrome(345663));
        System.out.println(isPalindrome(5555));
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(0));
        //The first 30 palindromic numbers (in decimal) are:  TEST CASES
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88,
    }
}


