public class p0_IntStringconversion {
    //integer to string conversion and string to integer conversion
    public static boolean isNumeric(String str){
        return (str!=null && str.matches("[0-9.]+")); //+indicates that repetition is allowed
    }
    //can extract no from string by parseint and valueof
    public static void numberExtracter(String st){
        if(st.contains(".")){
            //to check for decimal
            System.out.println(Double.parseDouble(st));
        }else{
            System.out.println(Integer.parseInt(st));
            //Integer.valueOf(st) and to convert from int to str, .toString
        }
    }
    public static void main(String[] args) {
        String testStr="58333";
        String testStr2="9388.58";
        System.out.println(isNumeric(testStr));
        numberExtracter(testStr);
        int no=3020202;
    }
}
