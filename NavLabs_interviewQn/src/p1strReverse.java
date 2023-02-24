public class p1strReverse {
   public static String reverser( String str){
       //1 By appending each characters: but in line6 each time new string is created, ineff memory use
//       String reversed="";
//       for (int i = str.length()-1; i >= 0; i--) {
//           reversed=reversed+str.charAt(i);
//       }
       //2 By using character array and reversing it
//       char[] charArray=str.toCharArray();
//       int n=charArray.length;
//       char[] revArray=new char[n];
//       for (int i = n-1; i>=0 ; i--) {
//           revArray[n-1-i]=charArray[i];
//       }
//       String strRev=new String(revArray);
//       //https://www.tutorialspoint.com/copy-char-array-to-string-in-java#:~:text=char%5B%5D%20arr%20%3D%20%7B%20'p,valueOf(arr)%3B
//       return strRev;

       //3 Using stringbuffer
       StringBuffer strreversed=new StringBuffer(str);
       return strreversed.reverse().toString();
       //wo .toString() conflicts with return string type wrt type of stringBuffer
   }

   public static void main(String[] args) {
        System.out.println(reverser("Manoj"));
    }
}