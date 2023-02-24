import java.util.Scanner;

public class p0_stringScanner {

    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scanner = new Scanner(System.in);
        //Nagendra Kumar Java techn India
        String line = scanner.nextLine();
        //String tokens[]=line.split("[ ]+");
        String tokens[] = line.split(" ");
        for (String input : tokens) {
            System.out.println(input);
        }
    }
}
