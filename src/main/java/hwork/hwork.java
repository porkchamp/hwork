package hwork;
import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author zanyar_jamal
 */
public class hwork {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("===============Homework_Manager[V1]===============");
        System.out.println("1:. Question1 - something simple with operators");
        System.out.println("2:. Question2 - solving an equation with java");
        System.out.println("3:. Question3 - things related to 'localdate'");
        System.out.print("your number: ");
        int num = scan.nextInt();
        switch (num){
            case 1: 
                q1();
                break;
            case 2: 
                q2();
                break;
            case 3: 
                q3();
                break;
            default:
                System.out.println("invalid option, input a number from the options above");
        }
    }
    public static void q1(){
        System.out.print("input x: ");
        double x = scan.nextDouble();
        System.out.print("input y: ");
        double y = scan.nextDouble();
        if (x != 0.0 && y != 0.0){
            float z = (float)(((x/3)+((5*y)/(3*x)))/((2*x+3*y)));
            System.out.println(z);
        }
        else {
            System.out.println("0 is not allowed");
        }
    }
    public static void q2(){
        // Your request is unclear, please clarify next time
        System.out.print("input x: ");
        int x = scan.nextInt();
        System.out.print("input y: ");
        int y = scan.nextInt();
        if (y == 0){
            System.out.println("z is undefined");
        }
        else if (y%2 == 0 && x%2 != 0){
            double x2 = y/3.0;
            double y2 = x/11.0;
            double z = (5.0*x2)/(2.0*y2);
            System.out.println("z is: "+z);
        }
        else {
            System.out.println("[y] must be even, and [x] must be odd");
        }
    }
    public static void q3(){
        LocalDate a = LocalDate.now();
        System.out.println("===============Question3===============");
        System.out.println("=============["+a+"]==============");
        System.out.println("1:. Enter 2 dates and find the difference in [days], [months], [years]");
        System.out.println("2:. Enter 2 times in 24 hour style and find the difference in [hours], [minutes]");
        System.out.print("your num: ");
        int num = scan.nextInt();
        switch (num){
            case 1: 
                System.out.println("input your date in this format 2019-12-19");
                System.out.print("Date 1: ");
                String strDate1 = scan.next();
                System.out.print("Date 2: ");
                String strDate2 = scan.next();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
                LocalDate date1 = LocalDate.parse(strDate1, formatter);
                LocalDate date2 = LocalDate.parse(strDate2, formatter);
                System.out.println(strDate1+"\t"+date1);
                System.out.println(strDate1+"\t"+date1);
                Period diff = Period.between(date1, date2);
                System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
                break;

            case 2: 
                //HH:mm
                System.out.println("input your time in this format 23:12");
                System.out.print("Time 1: ");
                String strTime1 = scan.next();
                System.out.print("Time 2: ");
                String strTime2 = scan.next();
                LocalTime localTime1 = LocalTime.parse(strTime1,
                    DateTimeFormatter.ofPattern("kk:mm"));
                LocalTime localTime2 = LocalTime.parse(strTime2,
                    DateTimeFormatter.ofPattern("kk:mm"));
                long hoursBetween = ChronoUnit.HOURS.between(localTime1, localTime2);
                long minutesBetween = ChronoUnit.MINUTES.between(localTime1, localTime2);
                System.out.println("The Difference in Time is- "+hoursBetween+":"+minutesBetween);
                break;
            default:
                System.out.println("invalid option, input a number from the options above");
        }
    }
}
