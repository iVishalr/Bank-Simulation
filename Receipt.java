import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
class Receipt
{
    static void receipt()throws InterruptedException,Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("\u000c\n\n\n\n\n\n");
       DesignCreator.IBB();
       System.out.println("\n\t\t\t\t\t\t\t\t  I   INTERNATIONAL BANK OF BENGALURU  ");
       System.out.println("\t\t\t\t\t\t\t\t  B   -------------------------------  ");
       System.out.println("\n\t\t\t\t\t\t\t\t  B             RECEIPT                ");
       System.out.println("\t\t\t\t\t\t\t\t  I             -------                ");
       if(TimeSimulator.g>=1) 
       {     Calendar cal = Calendar.getInstance();   
	         Date today = cal.getTime();
             cal.add(Calendar.YEAR,TimeSimulator.s);
             Date nextYear = cal.getTime();
             System.out.print("\t\t\t\t\t\t\t\t  B  "+nextYear+"  ");
       }
       else
       {     Calendar cal = Calendar.getInstance();   
	         Date today = cal.getTime();
             System.out.print("\t\t\t\t\t\t\t\t  B  "+today+"      ");
       }
       String s=fileReading.readFirstName(Bank.pan);
       int lo = Integer.parseInt(Bank.pan)%100;
       System.out.println("\n\t\t\t\t\t\t\t\t  B  Name   : "+s+"               ");
       System.out.println("\n\t\t\t\t\t\t\t\t  I  Card Number   : xxxxx"+lo+"    ");
       System.out.println("\t\t\t\t\t\t\t\t  B  Ammount Drawn : Rs "+Money.Amount_drawn+"            ");
       double balance=0;
       if(Accounta.a_type.equals("S"))
          balance=fileReading.getSBalance(Bank.pan);
        else if(Accounta.a_type.equals("C"))
          balance=fileReading.getCBalance(Bank.pan);
       System.out.println("\t\t\t\t\t\t\t\t  B  Balance Money : Rs "+balance+"     ");
       Atm.Control=0;
       Thread.sleep(15000);
       System.out.print("\u000c");
       Bank_Menu.display_Menu();
    }
}    