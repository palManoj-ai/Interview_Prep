import java.util.HashSet;
import java.util.Scanner;

public class Q_StringSet {
    public static void main(String[] args) {

        //sample ip
        //5
        //john tom
        //john mary
        //john tom
        //mary anna
        //mary anna

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> hset=new HashSet<String>();
        for (int j = 0; j < t; j++) {
            hset.add(pair_right[j]+pair_left[j]);
            System.out.println(hset.size());
        }
    }
    }

