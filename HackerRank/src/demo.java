import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {


        ArrayList<Integer> arrayNo=new ArrayList<Integer>();
        arrayNo.add(5);
        arrayNo.add(15);
        arrayNo.add(25);

        System.out.println("Arraylist default capacity: "+arrayNo.);

        Iterator<Integer> iter=arrayNo.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }





    }

    }


