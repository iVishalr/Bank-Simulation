import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
class Atm
{
    static int forInfo=0;
    static int Control=0;
    static void atmInformation()throws Exception
    {
        Control++;
        System.out.println("\n\n\n\n\n");
        int j=0;int i=0;
        int o=0;
        DesignCreator.IBB();
        atmInfo();
    }
    static void atmInfo()throws Exception
     {
        int i;BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a="WELCOME";
        int l=a.length();
        String b="TO";
        int l1=b.length();
        String c="INTERNATIONAL BANK OF BENGALURU ATM";
        int l2=c.length();
        System.out.print("\t\t\t\t\t\t\t\t\t             ");    
        for(i=0;i<l;i++)
         {   char ch=a.charAt(i);
             for(int j=0;j<1;j++)
             {  String m="";m=m+ch;
                 System.out.print(m);
                 Thread.sleep(230);
             }
         }
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t                        ");
        for(i=0;i<l1;i++)
         {
             char ch=b.charAt(i);
             for(int j=0;j<1;j++)
             {
                 System.out.print(ch);
                 Thread.sleep(500);
                }
        }
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t               ");
        for(i=0;i<l2;i++)
         {
             char ch=c.charAt(i);
             for(int j=0;j<1;j++)
             {
                 System.out.print(ch);
                 Thread.sleep(100);
                }
        }
        System.out.println();
        for(double k=0;k<=179;k++)
        {
            System.out.print("_");
        }
    }
    static void Atm()throws Exception
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\u000c");
        atmInformation();
        System.out.print("\n");
        System.out.print("\n\t\t\t\t\t\t\t\t          ");    
        if(TimeSimulator.g>=1)
        {
             Calendar cal = Calendar.getInstance();   
             Date today = cal.getTime();
             cal.add(Calendar.YEAR,TimeSimulator.s);
             Date nextYear = cal.getTime();
             System.out.print(nextYear);
        }
        else
        {
             Calendar cal = Calendar.getInstance();   
             Date today = cal.getTime();
             System.out.print(today);
        }
        System.out.println();
        DesignCreator.atmDesign();
        br.read();
        Bank.b++;
        System.out.print("\u000c");
        atmNext();
    }
    static void atmNext()throws Exception
    {
        for(int i=1;i<4;i++)
           { 
             System.out.print("\u000c");
             ProjectHeader.headerLine();
             System.out.print("Verifying your card");
             for(int j=1;j<=11;j++)
                {
                  System.out.print(".");
                  Thread.sleep(200);
                }
             System.out.print("\u000C");
           }
        atmNext2();
    }
    static void atmNext2()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double balance=0;
        if(Accounta.a_type.equals("S"))
          balance=fileReading.getSBalance(Bank.pan);
        else if(Accounta.a_type.equals("C"))
          balance=fileReading.getCBalance(Bank.pan);
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        System.out.println("Please select any of the following options");
        System.out.println("1 Withdraw");
        System.out.println("2 Fast Cash");
        System.out.println("3 Balance Enquiry");
        System.out.println("4 Bank Menu");
        int a = 0,flag=0;
        do
        {
            flag=0;
            try
            {
                String inp = br.readLine();
                if(!"".equals(inp))
                {
                    a = Integer.parseInt(inp);
                }
                else
                {    
                    throw new Exception();
                }
                if(a==1)
                {
                    if(Accounta.a_type.equals("C"))
                    {
                        System.out.print("\u000c");
                        Money.withdrawFromChecking();
                        printing();
                    }
                    else if(Accounta.a_type.equals("S"))
                    {
                        System.out.print("\u000c");
                        Money.withdrawFromSavings();
                        printing();
                    }
                }
                else if(a==2 && Accounta.a_type.equals("C"))
                { 
                    if(balance<1000)
                    {
                        System.out.println("Your Account Balance is less than the amount of money you want to withdraw. Please deposit some amount of money\n\nPress \n1. To Deposit some money\n2. To leave the current page");
                        do
                        {
                            flag=0;
                            try
                            {
                                if(Integer.parseInt(br.readLine())==2)
                                {
                                    Thread.sleep(1000);
                                    Money.userDeposit();
                                    atmNext2();
                                }
                                else if(Integer.parseInt(br.readLine())==3)
                                {
                                   ProjectHeader.loading();
                                   Bank_Menu.display_Menu();
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
                    else
                    {
                        balance=balance-1000;
                        System.out.println(balance);
                        Money.Amount_drawn=1000;
                        fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                        printing();
                    }
                }
                else if(a==2 && Accounta.a_type.equals("S"))
                { 
                    if(balance<1000)
                    {
                        System.out.print("Your Account Balance is less than the amount of money you want to withdraw.");
                        System.out.println("Please deposit some amount of money");
                        System.out.println("Press \n1. To re-enter withdrawal amount\n2. To Deposit some money\n3. To end transcation");
                        do
                        {
                            flag=0;
                            try
                            {
                                if(Integer.parseInt(br.readLine())==1)
                                {
                                    Thread.sleep(1000);
                                    Money.userDeposit();
                                    atmNext2();
                                }
                                else if(Integer.parseInt(br.readLine())==2)
                                {
                                   ProjectHeader.loading();
                                   Bank_Menu.display_Menu();
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
                    else
                    {
                        balance=balance-1000;
                        System.out.println(balance);
                        Thread.sleep(1200);
                        Money.Amount_drawn=1000;
                        fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                        printing();
                    }
                }
                else if(a==3)
                {
                    System.out.print("\u000c");
                    ProjectHeader.headerLine();
                    if(Accounta.a_type.equals("S"))
                          System.out.println("\nYour Savings Account Balance is Rs"+balance);
                    else if(Accounta.a_type.equals("C"))
                          System.out.println("\nYour Checking Account Balance is Rs"+balance);
                    Money.Amount_drawn=0;
                    Thread.sleep(4000);
                    atmNext2();
                }
                else if(a==4)
                {
                    Bank_Menu.display_Menu();
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
        Thread.sleep(1500);
    }
    static void printing()throws Exception
    {
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        System.out.println("Thank You for choosing us!");
        System.out.println("\nPlease collect your Receipt");
        Thread.sleep(2200);
        for(int i=1;i<4;i++)
           { 
             System.out.print("\u000c");
             ProjectHeader.headerLine();
             System.out.print("Printing");
             for(int j=1;j<=11;j++)
                {
                  System.out.print(".");
                  Thread.sleep(200);
                }
             System.out.print("\u000C");
           }
        Thread.sleep(1500);
        Receipt.receipt();
        Thread.sleep(500);
        Atm.Control=0;
        Bank_Menu.display_Menu();
    }
}        