package time;

import java.util.*;
import java.text.DecimalFormat;

public class TimeConvertor
{
    double hour, minute, second;
    Scanner sc = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("##.###");

    public void convertHourToMinute()
    {
        System.out.println("Enter the Hour");
        hour = sc.nextDouble();
        minute = hour * 60;
        System.out.println("Minutes: " + f.format(minute));
    }

    public void convertMinuteToHour()
    {
        System.out.println("Enter the Minute");
        minute = sc.nextDouble();
        hour = minute / 60;
        System.out.println("Hours: " + f.format(hour));
    }

    public void convertHourToSeconds()
    {
        System.out.println("Enter the Hour");
        hour = sc.nextDouble();
        second = hour * 3600;
        System.out.println("Seconds: " + f.format(second));
    }

    public void convertSecondsToHour()
    {
        System.out.println("Enter the Seconds");
        second = sc.nextDouble();
        hour = second / 3600;
        System.out.println("Hours: " + f.format(hour));
    }
}
