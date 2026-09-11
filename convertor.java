import currency.CurrencyConvertor;
import distance.DistanceConvertor;
import time.TimeConvertor;
import java.util.Scanner;

public class convertor {
    public static void main(String[] args) {

        int code, currency_code, distance_code, time_code;

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor cc = new CurrencyConvertor();
        DistanceConvertor dc = new DistanceConvertor();
        TimeConvertor tc = new TimeConvertor();

        System.out.println("Enter the code 1: Currency");
        System.out.println("                2: Distance");
        System.out.println("                3: Time");

        code = sc.nextInt();

        if (code == 1) {

            System.out.println("Enter the Currency code 1: Euro");
            System.out.println("                      2: Dollar");
            System.out.println("                      3: Yen");

            currency_code = sc.nextInt();

            if (currency_code == 1) {
                cc.convertInrToEuro();
                cc.convertEuroToInr();
            }
            else if (currency_code == 2) {
                cc.convertInrToDollar();
                cc.convertDollarToInr();
            }
            else if (currency_code == 3) {
                cc.convertInrToYen();
                cc.convertYenToInr();
            }
            else {
                System.out.println("Invalid Code");
            }
        }

        else if (code == 2) {

            System.out.println("Enter the Distance code 1: Meter");
            System.out.println("                       2: Miles");

            distance_code = sc.nextInt();

            if (distance_code == 1) {
                dc.convertMeterToKm();
                dc.convertKmToMeter();
            }
            else if (distance_code == 2) {
                dc.convertMilesToKm();
                dc.convertKmToMiles();
            }
            else {
                System.out.println("Invalid Code");
            }
        }

        else if (code == 3) {

            System.out.println("Enter the Time code 1: Minutes");
            System.out.println("                   2: Seconds");

            time_code = sc.nextInt();

            if (time_code == 1) {
                tc.convertHourToMinute();
                tc.convertMinuteToHour();
            }
            else if (time_code == 2) {
                tc.convertHourToSeconds();
                tc.convertSecondsToHour();
            }
            else {
                System.out.println("Invalid Code");
            }
        }

        else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}