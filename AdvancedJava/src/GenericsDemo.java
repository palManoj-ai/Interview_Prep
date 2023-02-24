public class GenericsDemo {
    //generics used where datatype uncertainity is present
    public void showInfo(<T>){
        System.out.println("The ip is "+T);
    }
    public static void main(String[] args) {

        GenericsDemo gd=new GenericsDemo();
        gd.showInfo("hi");

    }
}
