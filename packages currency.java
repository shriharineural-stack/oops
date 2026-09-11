packages currency;
import java.util.*;
import java.text.DecimalFormat;
Class CurrencyConvertor
{
   double rupee,doller,euro,yen;
   Scanner sc=new Scanner(System.in);
   DecimalFormat f=newDecimalFormat("##.###");
   public convrtInrToEuro()
   {
     System.out.println("Enter amount in rupees");
     rupee=sc.nextFloat();
     euro=rupee/80;
     System.out.println("Euro:"+f.format(rupee));
   }
   public convertEuroTolnr()
   }
     System.out.println("Enter amount in Euro");
     euro=sc.nextFloat();
     rupee=euro*80;
     System.out.println("Rupees:"+f.format(rupee));
   
   public convertInrToDollar()
   {
     System.out.println("Enter amount in rupees ");
     rupee=sc.nextFloat();
     dollar=rupee/66;
     System.out.println("Dollar:"+f.format(dollar));
   }
   public convertDollarTolnr()
   {
     Syastem.out.println("Enter amount in Dollar");
     dollar=sc.nextFloat();
     rupee=dollar*66;
     System.out.println("Rupee :"+f.format(rupees))
   }
   public convertInrToyen()
   {
     System.out.println("Enter amount in rupees");
   {
     System.out.println("Enter the amount in rupees");
     rupee=sc.nextFloat();
     yen=rupee/0.61;
     System.out.println("Yen:"+f.format(yen));
   }
   public convertYenTolnr()
   {
   System.out.println("Enter amount in Yen");
   euro=sc.nextFloat();
   rupee=yen*0.61;
   System.out.println("Rupees:"+f.format(rupee));
   }
}