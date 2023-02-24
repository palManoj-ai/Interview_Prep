public class p3cleanString {
    private static String cleaner(String str){

        String cleanStr=str.replaceAll("[^ a-zA-Z0-9]","");
        //[^ a-zA-Z0-9] means include only space alphabet and nos rest are omitted
        return cleanStr;
    }

    public static void main(String[] args) {
        String testStr1=" @%$سعدت بلقائك.Hello there";
        String testStr2="2023...AaboutTtime";    //remove caps and nos
        System.out.println(cleaner(testStr1));  //Hello there
        System.out.println(cleaner(testStr2));   //try regex [^ a-z] to allow only lowercase
        //how to remove . fullstop in regex  [^ .a-zA-Z0-9]
    }
}
