import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class Bank
{  
   static long Account=0;
   static String Password;
   static double balance;
   static int b=0;
   static int v=0;
   static double a;
   static String panID;
   static String pan;
   static String pan2;
   static Calendar now = Calendar.getInstance();
   static int currentYear=now.get(Calendar.YEAR);
   static void MAIN()throws Exception
   {   
       ProjectHeader.presentation(); 
   }
}