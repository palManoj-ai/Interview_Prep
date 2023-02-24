import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q11_InttoString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        double number=sc.nextDouble();
        //using float causes decimal to round off

        //Method 1: using Integer.toString()
        //String str=Integer.toString(number);
        //System.out.println(str);

        //Method 2: using String.valueOf()
        String str2=String.valueOf(number);
        System.out.println(str2);

        //Method 3: using string concatenation
        //String str3=number+"";
        //System.out.println(str3);

    }

}
