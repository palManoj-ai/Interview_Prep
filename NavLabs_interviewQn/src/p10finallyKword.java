public class p10finallyKword {
    public static void main(String[] args) {
        //1 with no exception
        try{
            System.out.println("Inside try block 1");
        }
        finally {
            System.out.println("finally --1");
        }

        //2 with exception
        int num=60;
        try{
            System.out.println("Inside try block 3");
            System.out.println(num/0);
        }catch (ArithmeticException e){
            System.out.println("Divide by zero error");
        }
        finally {
            System.out.println("Printing even if exception occurs");
        }
        //3 with wrong exception
        try{
            System.out.println("Inside try block 3");
            System.out.println(num/0);
        }catch (NullPointerException e){   //nullpointerexception isnt the correct exception
            System.out.println("Divide by zero error");
        }
        finally {
            System.out.println("Printing even if exception occurs"); //will throw the exception later
        }
    }
}
