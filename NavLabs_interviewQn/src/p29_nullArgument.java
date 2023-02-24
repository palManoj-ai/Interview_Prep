public class p29_nullArgument {
    //pass null arg with method overloading of strings and object types
    //object and string both can have null values. object is superclass of string
    //java primitive types cant have null values: int float char double
    //if both string and stringBuffer are used, then java: reference to test is ambiguous
    //is op as both string and stringbuilder have same hierarchy

    public static void test(Object o){
        System.out.println("Object argument");
    }
    public static void test(int t){
        System.out.println("Integer argument");
    }

    public static void test(String x){
        System.out.println("String argument");
    }

//    public static void test(StringBuffer x){   //or stringbuilder
//        System.out.println("StringBuffer argument");
//    }
    public static void main(String[] args) {
        //svd

        test(null);   ///so string arg is printed




    }
}
