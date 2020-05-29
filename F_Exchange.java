import java.io.*;
class F_Exchange
{   static double s;
    static int a;
    static double b;
    static void exchange()throws Exception
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        DesignCreator.foreignExchange();
        System.out.println("Choose any of the following");
        System.out.println("1 To know the current Currency Rates");
        System.out.println("2 Conversion Menu");
        System.out.println("3 Bank Menu");
        a=0;
        int flag=0;
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
                    throw new NumberFormatException();
                }
                if(a==1)
                {
                    DesignCreator.newsLineDisplay();
                    exchange();
                }
                else if(a==2)
                {
                    System.out.print("\u000c");
                    ProjectHeader.headerLine();
                    System.out.println("Choose the type of currency conversion"); System.out.print(" From Indian Rupees  to -\n");
                    System.out.print("                            1 U.S.Dollars \n");
                    System.out.print("                            2 Pound \n");
                    System.out.print("                            3 Euro \n");
                    System.out.print(" To Indian Ruppes  from - \n");
                    System.out.print("                            4 U.S.Dollars \n");
                    System.out.print("                            5 Pound \n");
                    System.out.print("                            6 Euro \n");
                    exchangeWorker();
                }
                else if(a==3)
                {
                    Bank_Menu.display_Menu();
                }
                else
                {
                    throw new NumberFormatException();
                }
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid Choice. Choose Again!\n");
                Thread.sleep(40);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void exchangeWorker()throws Exception
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        a=0;
        int flag=0;
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
                     throw new NumberFormatException();
                 }
                 if(a>0 && a<7)
                 {
                     System.out.println("Enter the amount");
                     b=Double.parseDouble(br.readLine());
                     System.out.print("The value is ");
                     if(a==1)
                     {   
                         if(Accounta.age<18)
                         {
                             s=b/67.97;System.out.print("USD"+s+"\nOne Dollar is equal to ₹67.97");
                             Thread.sleep(5000);
                         }
                         else
                         {
                             s=b/67.97;System.out.print("USD"+s);
                             Thread.sleep(5000);
                         }
                         passNext();
                     }
                     else if(a==2)
                     {
                         if(Accounta.age<18)
                         {
                             s=b/84.53;System.out.print("POUND"+s+"\nOne Pound is equal to ₹84.53");
                             Thread.sleep(5000);
                         }
                         else
                         {
                             s=b/84.53;System.out.print("POUND"+s);
                             Thread.sleep(5000);
                         }
                         passNext();
                     }
                     else if(a==3)
                     {
                         if(Accounta.age<18)
                         {
                             s=b/72.65;System.out.print("EURO"+s+"\nOne Euro is equal to ₹72.53");
                             Thread.sleep(5000);
                         }
                         else
                         {
                             s=b/72.65;System.out.print("EURO"+s);
                             Thread.sleep(5000);
                         }
                         passNext();
                     }
                     else if(a==4)
                     {
                         if(Accounta.age<18)
                         {
                             s=b*67.97;System.out.print("Rs "+s);
                             Thread.sleep(5000);
                         }
                         else
                         {
                             s=b*67.97;System.out.print("Rs "+s);
                             Thread.sleep(5000);
                         }
                         passNext();
                     }
                     else if(a==5)
                     {
                         s=b*84.53;System.out.print("Rs "+s);
                         Thread.sleep(5000);
                         passNext();
                     }
                     else if(a==6)
                     {
                         s=b*72.65;System.out.print("Rs "+s);
                         Thread.sleep(5000);
                         passNext();
                     }
                 }
                 else
                     {
                         throw new NumberFormatException();
                     }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid choice,please choose again");
                Thread.sleep(3000);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void passNext()throws Exception
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        System.out.println("Choose");
        System.out.println("1 To return to Foreign Exchange menu");
        System.out.print("2 To return to Bank Menu\n");
        a = 0 ;
        int flag=0;
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
                    System.out.println("Invalid menu entered , please enter a valid menu");    
                    Thread.sleep(1000);
                    check();
                }
                if(a==1)
                { 
                    System.out.print("\u000c");
                    exchange();
                }
                else if(a==2)
                {
                    Bank_Menu.display_Menu();
                }
                else 
                { 
                    throw new NumberFormatException();
                }
            }
            catch(NumberFormatException e)
            {
                    System.out.print("Invalid Choice. Choose Again!");
                    flag=1;
            }
        }
        while(flag==1);
    }
    static void check()throws Exception
    {
        passNext();
    }
}
