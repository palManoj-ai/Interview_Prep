import java.time.LocalDate;

public class Q12_DateTime {
    public static void main(String[] args) {
      //working with date time: prior to java8 calendar class
        //with java8 datetime, localdatetime, and localtime

        LocalDate  date=LocalDate.now();
        System.out.println(date);   // in format 2023-02-10

        //custom date
        LocalDate date2=LocalDate.of(2015,12,22);
        System.out.println(date2);
        System.out.println(date2.getYear()); //2015
        System.out.println(date2.getMonthValue()); //12
        System.out.println(date2.getMonth());   //December
        System.out.println(date2.getDayOfMonth());  //22
        System.out.println(date2.getDayOfWeek());   //tuesday

        System.out.println("***********");
        //Adding time
        System.out.println(date2.plusDays(6)); //2015-12-28
        System.out.println(date2.plusMonths(2));  // 2016-02-22
        System.out.println(date2.plusYears(5)); //2020-12-22

        //subtracting time
        System.out.println(date2.minusDays(6)); //2015-12-16
        System.out.println(date2.minusMonths(2));  // 2015-10-22
        System.out.println(date2.minusYears(5)); //2010-12-22


    }
}
