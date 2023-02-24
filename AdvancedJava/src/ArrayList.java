import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names=new java.util.ArrayList<String>();

        names.add("manoj");
        names.add("manju");
        names.add("joe");
        names.add("adam");
        names.add("manoj");
        names.add(null);

        System.out.println(names);

    }
}