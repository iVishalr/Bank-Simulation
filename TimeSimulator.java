import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
class TimeSimulator
{
    static double time;
    static int t;
    static double k=0;
    static int s=0;
    static int g=0;
    static int years = 0;
    static double loan=0;
    static int afterloan=0;
    static void accBalanceLess()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        System.out.print("Your Account Balance is very less!");
        System.out.println("Please deposit some amount of money");
        System.out.println("Press \n1. To re-enter withdrawal amount\n2. To Deposit some money");
        do
        {
            flag=0;
            try
            {
                int i=Integer.parseInt(br.readLine());
                if(i==1)
                {
                    Thread.sleep(1000);
                    if(Accounta.a_type.equals("S"))
                                Money.withdrawFromSavings();
                    else if(Accounta.a_type.equals("C"))
                                Money.withdrawFromChecking();
                }
                else if(i==2)
                {
                    Thread.sleep(1000);
                    Money.userDeposit();
                }
                else
                    throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid menu choice");
                Thread.sleep(2500);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void accBalanceLess2()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        System.out.print("Your Account Balance is very less than the amount you want to pay.");
        System.out.println("Please deposit some amount of money.");
        System.out.println("Press \n1. To Deposit some money");
        do
        {
            flag=0;
            try
            {
                int i=Integer.parseInt(br.readLine());
                if(i==1)
                {
                    Thread.sleep(1000);
                    Money.userDeposit();
                }
                else
                    throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid menu choice");
                Thread.sleep(2500);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void timesim()throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         if(Accounta.a_type.equals("S"))
         {
             loan=fileReading.getSLoanBalance(Bank.pan);
             years = fileReading.readSSimulatedYearNumber(Bank.pan);
         }
         else if(Accounta.a_type.equals("C"))
         {
             loan = fileReading.getCLoanBalance(Bank.pan);
             years = fileReading.readCSimulatedYearNumber(Bank.pan);
         }
         System.out.print("\u000c");    
         ProjectHeader.headerLine();
         System.out.println("Please select how much time do you want to simulate");
         System.out.println("0 Bank Menu\n1 One Year\n2 Two Years");
         if(Loan.takenLoan==1 && years!=0)
         {
             System.out.println("You are not allowed to simulate time one or two years back since your loan is not completely paid");
         }
         if(years!=0 && Loan.takenLoan!=1)
         {
             System.out.println("3 Go back One Year");
             if(years!=1)
                    System.out.println("4 Go back Two Years");
         }
         System.out.println("NOTE : Once the money is paid for your locker, if you have taken, after simulation cannot be returned! Therefore please think and simulate time.");
         int flag=0;
         do
         {
             flag=0;
            try
            {
                t=Integer.parseInt(br.readLine());
                if(t==0)
                {   Bank_Menu.display_Menu();
                }
                if(years==1)
                {   if(t<0 || t>3)
                        throw new Exception();
                }
                else if(years==0)
                {   if(t<0 || t>2)
                        throw new Exception();
                }
                else if(years>1)
                {   if(t<0 || t>4)
                        throw new Exception();
                }
            }
            catch(Exception e)
            {   System.out.println("Enter a valid menu choice");
                Thread.sleep(1000);
                flag=1;
            }
         }
         while(flag==1);
         timesim2();
    }
    public static void timesim2()throws Exception
    {      
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         g++;
         double b=0,ub=0;
         int t1=0;
         if(Accounta.a_type.equals("S"))
         {
             s = fileReading.readSSimulatedYearNumber(Bank.pan);
         }
         else if(Accounta.a_type.equals("C"))
         {
             s = fileReading.readCSimulatedYearNumber(Bank.pan);
         }        
         if(Accounta.a_type.equals("C"))
         {
            if(t==1)
            {   
             s++;
             t1=1;
             k=Interest.interest();
             b=fileReading.getCBalance(Bank.pan);
             b=b+k;
             fileWriting.CAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getCBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();   
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s);
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age+s;
             fileReading.readCsv2(Bank.pan,t1);
             fileWriting.writeCSimulatedYearNumber(Bank.pan,s);
           }
           else if(t==2)
           {     
             s=s+2;
             t1=2;
             k=Interest.interest();
             b=fileReading.getCBalance(Bank.pan);
             b=b+k;
             fileWriting.CAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getCBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s); 
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age+s;
             fileReading.readCsv2(Bank.pan,t1);
             fileWriting.writeCSimulatedYearNumber(Bank.pan,s);
           }
           else if(t==3)
           {
             s=s-1;
             t1=1;
             k=Interest.interest();
             b=fileReading.getCBalance(Bank.pan);
             if(b>=100)
                b=b-k;
             else
             {
                 accBalanceLess();
                 timesim();
             }
             fileWriting.CAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getCBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s); 
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age-s;
             fileReading.readCsv2(Bank.pan,-(t1));
             fileWriting.writeCSimulatedYearNumber(Bank.pan,s);
           }
           else if(t==4 && years!=1)
           {
             s=s-2;
             t1=2;
             k=Interest.interest();
             b=fileReading.getCBalance(Bank.pan);
             if(b>=100)
                b=b-k;
             else
             {
                 accBalanceLess();
                 timesim();
             }
             fileWriting.CAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getCBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s); 
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age-s;
             fileReading.readCsv2(Bank.pan,-(t1));
             fileWriting.writeCSimulatedYearNumber(Bank.pan,s);
           }
         }
         else if(Accounta.a_type.equals("S"))
         {
            if(t==1)
            {     
             s++;
             t1=1;
             k=Interest.interest();
             b=fileReading.getSBalance(Bank.pan);
             b=b+k;
             fileWriting.SAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getSBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();   
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s);
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age+s;
             fileReading.readCsv2(Bank.pan,t1);
             fileWriting.writeSSimulatedYearNumber(Bank.pan,s);
           }
           else if(t==2)
           {   
             s=s+2;
             t1=2;
             k=Interest.interest();
             b=fileReading.getSBalance(Bank.pan);
             b=b+k;
             fileWriting.SAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getSBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s); 
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age+s;
             fileReading.readCsv2(Bank.pan,t1);
             fileWriting.writeSSimulatedYearNumber(Bank.pan,s);
           }
           else if(t==3)
           {   
             s=s-1;
             t1=1;
             k=Interest.interest();
             b=fileReading.getSBalance(Bank.pan);
             if(b>=100)
                b=b-k;
             else
             {
                 accBalanceLess();
                 timesim();
             }
             fileWriting.SAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getSBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s); 
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age-s;
             fileReading.readCsv2(Bank.pan,-(t1));
             fileWriting.writeSSimulatedYearNumber(Bank.pan,s);
           }
           else if(t==4 && years!=1)
           {   
             s=s-2;
             t1=2;
             k=Interest.interest();
             b=fileReading.getSBalance(Bank.pan);
             if(b>=100)
                b=b-k;
             else
             {
                 accBalanceLess();
                 timesim();
             }
             fileWriting.SAccountDeposit(Bank.pan,String.valueOf(b));
             ub=fileReading.getSBalance(Bank.pan);
             ProjectHeader.headerLine();
             System.out.println("Your Account Balance is Rs "+ub);
             Calendar cal = Calendar.getInstance();
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,s); 
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
             Accounta.age=Accounta.age-s;
             fileReading.readCsv2(Bank.pan,-(t1));
             fileWriting.writeSSimulatedYearNumber(Bank.pan,s);
           }
         }
         System.out.print("\nPress Enter to Continue");
         br.read();
         locker();
    }
    static void locker()throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("\u000c");
         ProjectHeader.headerLine();
         double balance=0;
         double updatedBalance=0;
         if(Accounta.a_type.equals("C"))
         {
          if(t==1)
          {
            if(Account_Information.h.equals(""))
            {
                switch(Account_Information.Container)
                {
                      case 1: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+40*6.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=40*6.5)
                                 balance=balance-40*6.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 2: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+60*5.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=60*5.5)
                                 balance=balance-60*5.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 3: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+120*4.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=120*4.5)
                                 balance=balance-120*4.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 4: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+240*4.45+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=240*4.45)
                                 balance=balance-240*4.45;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              break;
                }
            }
          }
          else if(t==2)
          {
            if(Account_Information.h.equals(""))
           {
             switch(Account_Information.Container)
             {
                      case 1: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*40*6.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=2*40*6.5)
                                 balance=balance-2*40*6.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 2: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*60*5.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=2*60*5.5)
                                 balance=balance-2*60*5.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 3: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*120*4.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=2*120*4.5)
                                 balance=balance-2*120*4.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000); 
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 4: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*240*4.45+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getCBalance(Bank.pan);
                              if(balance>=2*240*4.45)
                                 balance=balance-2*240*4.45;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getCBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
             }
           }
          }
          next();
         }
         if(Accounta.a_type.equals("S"))
         {
          if(t==1)
          {
            if(Account_Information.h.equals(""))
            {
             switch(Account_Information.Container)
             {
                      case 1: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+40*6.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=40*6.5)
                                 balance=balance-40*6.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 2: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+60*5.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=60*5.5)
                                 balance=balance-60*5.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 3: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+120*4.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=120*4.5)
                                 balance=balance-120*4.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000); 
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 4: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+240*4.45+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=240*4.45)
                                 balance=balance-240*4.45;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
             }
            }
          }
          else if(t==2)
          {
            if(Account_Information.h.equals(""))
           {
             switch(Account_Information.Container)
             {
                      case 1: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*40*6.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=2*40*6.5)
                                 balance=balance-2*40*6.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 2: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*60*5.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=2*60*5.5)
                                 balance=balance-2*60*5.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 3: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*120*4.5+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=2*120*4.5)
                                 balance=balance-2*120*4.5;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
                      case 4: System.out.print("Message!:");
                              System.out.println("Please pay for your locker Rs "+2*240*4.45+" .\n         Press Enter to pay.");
                              br.read();
                              balance=fileReading.getSBalance(Bank.pan);
                              if(balance>=2*240*4.45)
                                 balance=balance-2*240*4.45;
                              else
                              {
                                  accBalanceLess2();
                                  locker();
                              }
                              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                              updatedBalance=fileReading.getSBalance(Bank.pan);
                              System.out.println("Your Account Balance is Rs "+updatedBalance);
                              Thread.sleep(2000);
                              System.out.print("         Thank You");
                              Thread.sleep(2000);
                              break;
             }
           }
          }
          next();
         }
    }
    static void next()throws Exception
    {
         if(Loan.takenLoan==1)
         {
             afterloan=1;
             Loan l = new Loan();
             l.loanRePayment();
         }
         System.out.print("\u000c");
         ProjectHeader.headerLine();
         System.out.println("Please press :\n              1 . to Continue\n              2 . to Simulate more time"); 
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int flag=0;
         do
             {
                 flag=0;
                 try
                 {
                     int s=Integer.parseInt(br.readLine());
                     if(s==1)
                     {
                         Bank_Menu.display_Menu();
                     }
                     else if(s==2)
                     {
                         timesim();
                     }
                     else 
                         throw new Exception();
                 }
                 catch(Exception e)
                 {
                     System.out.println("Invalid menu entered , please enter a valid menu");    
                     Thread.sleep(1000);
                     flag=1;
                 }
             }
             while(flag==1);
    }
}