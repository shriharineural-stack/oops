/*import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;
public class Convertor
{
	public static void main(String[]args)
	{
		int code,currency_code,distance_code,time_code;
		Scanner sc = new Scanner(System.in);
		CurrencyConvertor currency= new CurrencyConvertor();
		DistanceConvertor distance= new DistanceConvertor();
		TimeConvertor time = new TimeConvertor();
		System.out.println("Enter the code 1:Currency\n2:Distance\n3:Time");
		code = sc.nextInt();
		if(code==1)
		{
			System.out.println("Enter the Currency code 1:Euro\n2:Dollar\n3:Yen");
			currency_code = sc.nextInt();
			if(currency_code==1)
			{
			    currency.convertInrToEuro();
			    currency.convertEuroToInr();
			}
			else if(currency_code == 2)
			{
				currency.convertInrToDollar();
				currency.convertDollarToInr();
			}
			else if(currency_code==3)
			{
				currency.convertInrToYen();
				currency.convertYenToInr();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}
		else if(code==2)
		{
			System.out.println("Enter the Distance code 1:Meter\n2:Miles");
			distance_code = sc.nextInt();
			if(distance_code==1)
			{
				distance.convertMeterToKm();
				distance.convertKmToMeter();
			}
			else if(distance_code == 2)
			{
				distance.convertMilesToKm();
				distance.convertKmToMiles();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}
		else if(code==3)
		{
			System.out.println("Enter the Time code 1:Minutes\n2:Seconds");
			time_code = sc.nextInt();
			if(time_code==1)
			{
				time.convertHourToMinute();
				time.convertMinuteToHour();
			}
			else if(time_code == 2)
			{
			    time.convertHourToSeconds();
				time.convertSecondsToHour();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}
		else
		{
			System.out.println("Invalid Code");
		}
	}
}
*/

//     javac currency/*.java distance/*.java time/*.java Convertor.java

import currency.*; 
import distance.*; 
import time.*;
import java.util.Scanner; 
public class Convertor
{
public static void main (String[] args)
{
int code,currency_code,distance_code,time_code;
Scanner sc = new Scanner(System.in);
CurrencyConvertor cc =new CurrencyConvertor();
DistanceConvertor dc =new DistanceConvertor();
TimeConvertor tc =new TimeConvertor();
System.out.println("Enter the code 1:Currency\n2:Distance\n3:Time"); 
code=sc.nextInt();
if(code==1)
{
System.out.println("Enter the Currecy code 1:Euro\n2:Dollar\n3:Yen"); 
currency_code=sc.nextInt();
if(currency_code == 1)
{
cc.convertInrToEuro();
cc.convertEuroToInr();
}
else if(currency_code == 2)
{
cc.convertInrToDollar(); 
cc.convertDollarToInr();
}
else if(currency_code == 3)
{
cc.convertInrToYen(); 
cc.convertYenToInr();
}
else
{
System.out.println("Invalid Code");
}
}
else if(code==2)
{
System.out.println("Enter the Distance code 1:Meter\n2:Miles"); 
distance_code=sc.nextInt();
if(distance_code == 1)
{
dc.convertMeterToKm();
dc.convertKmToMeter();
}
else if(distance_code == 2)
{
dc.convertMilesToKm(); 
dc.convertKmToMiles();
}
else
{
System.out.println("Invalid Code");
}
}
else if(code==3)
{
System.out.println("Enter the Time code 1:Minutes\n2:Seconds"); 
time_code=sc.nextInt();
if(time_code == 1)
{
tc.convertHourToMinute();
tc.convertMinuteToHour();
}
else if(time_code == 2)
{
tc.convertHourToSeconds(); 
tc.convertSecondsToHour();
}
else
{ 
System.out.println("Invalid Code");
}
}
else
{
System.out.println("Invalid Code");
}
sc.close();
}
}