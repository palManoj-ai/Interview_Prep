import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int x=1;
        for(int i=1;i<=128;i+=i){
            x+=x;
        }
        System.out.println(x);
    }
    }


