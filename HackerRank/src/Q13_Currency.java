import java.text.NumberFormat;
import java.util.Locale;

public class Q13_Currency {
    //format double payment in currency of countries
    //hint use NumberFormat class with locale

    public static void main(String[] args) {
        double payment=45292929.593;

       String usFormat= NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       String chinaFormat= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

       //for india no locale so need to create one
        Locale indiaLocale=new Locale("en","in");
        String indiaFormat= NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        Locale nepalLocale=new Locale("en","np");
        String nepalFormat= NumberFormat.getCurrencyInstance(nepalLocale).format(payment);

        System.out.println("US Format : "+usFormat);
        System.out.println("China Format : "+chinaFormat);
        System.out.println("India Format : "+indiaFormat);
        System.out.println("Nepal Format : "+nepalFormat);

    }
}
