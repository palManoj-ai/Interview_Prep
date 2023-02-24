public class p28_Helloworld {
    //wap to print hello world without using ;

    public static void main(String[] args) {

        //method 1
        if(System.out.printf("Hello World\n")==null){}  //creates string object and compares to null

        //method 2
        if(System.out.append("Hello World\n").equals(null)){}

        //method 3
        for(int i=0;i<1; System.out.println("Hello World")){
            i++;
        }
    }
}
