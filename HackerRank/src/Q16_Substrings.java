import java.util.Scanner;

public class Q16_Substrings {
    //Helloworld
    //3 7
    //op lowo : use substring
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));

    }
}
