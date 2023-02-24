public class p9swapStrings {
    public static void main(String[] args) {
        String a="Hello";
        String b="world";
        //swap without using two variables
        //1 concatenate both
        a=a+b;
        //2 select and assign to one
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
