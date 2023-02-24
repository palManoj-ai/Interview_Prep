public class p30_IntComparebyCaching {

    public static void main(String[] args) {

        //integer range is -128 to 128, value outside it isnot cached

        Integer x=198;  //both 98 true and if value outside range is used false because it isnt stored
        Integer y=198;

        System.out.println(x==y);
    }
}
