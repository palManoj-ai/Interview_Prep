public class p7StringManipulation {
    public static void main(String[] args) {
        String str="@#Hello Manoj here!!";
        String str2="@#Hello Manoj Here!!";
        //String manipulation eg

        System.out.println("The string length is " +str.length());
        System.out.println("The character at 6th position is "+str.charAt(5));
        System.out.println("The index of e is "+ str.indexOf("e"));
        //position of third e
        System.out.println("The index of e is "+ str.indexOf("e",str.indexOf("e")+1));
        System.out.println("The position of 3rd e is "+ str.indexOf("e",str.indexOf("e",str.indexOf("e")+1)+1));

        //printing ", or ', or \ in a line we must use escape sequence ie \ to print these
        //More: https://docs.oracle.com/javase/tutorial/java/data/characters.html
        System.out.println("The index of word \"here\" is at: "+str.indexOf("here"));
        System.out.println(" The \\ is called forward slash and \'demo\' is a single quote.");

        //checkout printf formatting too

        //string comparison
        System.out.println(str.equals(str2));  //false as H is caps
        System.out.println(str.equalsIgnoreCase(str2));    //compare wo case, true

        //substring
        System.out.println(str.substring(8,13));

        //trim
        String str3="   Welcome   back  ";
        System.out.println(str3.trim());
        System.out.println(str3);   //still prints as line 27 becase trim op need to assign
        str3=str3.trim();
        System.out.println(str3);   //now works
        //to remove the white spaces also
        System.out.println(str3.replace(" ",""));

        String str4="02-09-2015";
        System.out.println(str4.replace("-","/"));

        String str5=" Hello world this is Nepal.";
        String[] strArray =str5.split(" ");
        for(String x:strArray){
            System.out.println(x);
        }

        String str6="Nepa";
        str6=str6.concat("l");
        System.out.println(str6);

        //IMP
        String x="Hello";
        String y="World";
        int a=100;
        int b=200;
//        System.out.println(x*2);     bad operand error,
        System.out.println(x+y+a+b);
        //op is HelloWorld100200 why left to right precedence string+int=string
        System.out.println(x+y+(a+b)); //op is HelloWorld300 because () separates int
        System.out.println(a+b+x+y);   //first no are added and then string is concatenated

    }
}
