import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEg {

    public static void main(String[] args) {
        List<String> strList=new ArrayList<String>();
        strList.add("Apple");
        strList.add("Mango");
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Grapes");
        strList.add("mango");

        //print distinct elements only ( no need to convert to set) wo uppercase it ignores mango/Mango
        System.out.println(strList.stream().map(s -> s.toUpperCase())
                .distinct().count());


        //below is called pipeline in stream api
        strList.stream()
                .filter(s->!s.equalsIgnoreCase("Mango")).sorted(Comparator.reverseOrder())
                //.collect(Collectors.toSet())
                .collect(Collectors.toList())
                .forEach(System.out::println);

                //.sorted()  to sort asc
                /*.sorted((c1,c2) -> c2.compareTo(c1)) use to sort in desc*/
                //.sorted(Comparator.naturalOrder())   //asc order
                //.collect(Collectors.toList()) use to convert to list
    }


}
