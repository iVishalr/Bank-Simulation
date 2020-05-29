import java.io.*;
class Money
{   
    static double Amount_drawn;
    static double Amount_credit;
    static void a_Menu()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        System.out.println("1 Deposit");
        System.out.println("2 Withdraw");
        System.out.println("3 Balance Enquiry");
        System.out.println("4 Back to Bank Menu");
        int flag=0;
        do
        {
            flag=0;
            try
            {
                int a = 0 ;
                String inp = br.readLine();
                if(!"".equals(inp))
                {
                    a = Integer.parseInt(inp);
                }
                else
                {    
                    System.out.print("Invalid menu entered, ");
                    System.out.println("please enter a valid menu");    
                    Thread.sleep(1500);
                    w();
                }
                if(a==1)
                {
                    System.out.print("\u000c");
                    if(Accounta.a_type.equals("C"))
                    {
                        userDeposit();
                    }
                    else if(Accounta.a_type.equals("S"))
                    {
                        userDeposit();
                    }
                    w();
                }
                else if(a==2)
                {
                    System.out.print("\u000c");
                    if(Accounta.a_type.equals("C"))
                    {
                        withdrawFromChecking();
                    }
                    else if(Accounta.a_type.equals("S"))
                    {
                        withdrawFromSavings();
                    }
                    w();
                }
                else if(a==3)
                { 
                    System.out.print("\u000c");
                    if(Accounta.a_type.equals("C"))
                    {
                        ProjectHeader.headerLine();
                        System.out.print("\n\nYour Checkings Account Balance : ");
                        System.out.print("Rs "+fileReading.getCBalance(Bank.pan));
                    }
                    else if(Accounta.a_type.equals("S"))
                    {
                        ProjectHeader.headerLine();
                        System.out.print("\n\nYour Savings Account Balance : ");
                        System.out.print("Rs "+fileReading.getSBalance(Bank.pan));
                    }
                    Thread.sleep(4000);
                    w();
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
                System.out.print("Invalid menu entered, ");
                System.out.println("please enter a valid menu");    
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void w()throws Exception
    {
         a_Menu();
    }
    static void deposit()throws Exception
    {   
        if(Accounta.a_type.equals("C"))
        {
          System.out.print("\u000c");
          ProjectHeader.headerLineForStarting();
          BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
          System.out.print("How much amount do you ");
          System.out.println("want to deposit to your account?");
          String h=br.readLine();
          fileWriting.CAccountDeposit(Bank.pan,h);
          double balance=fileReading.getCBalance(Bank.pan);
          System.out.print("Your Account Balance is ");
          System.out.println("Rs "+balance);
          Thread.sleep(3000);
        }
        else if(Accounta.a_type.equals("S"))
        {
          System.out.print("\u000c");
          ProjectHeader.headerLineForStarting();
          BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
          System.out.print("How much amount do you ");
          System.out.println("want to deposit to your account?");
          String h=br.readLine();
          fileWriting.SAccountDeposit(Bank.pan,h);
          double balance=fileReading.getSBalance(Bank.pan);
          System.out.print("Your Account Balance is ");
          System.out.println("Rs "+balance);
          Thread.sleep(3000);
        }
    }
    static void userDeposit()throws Exception
    {   
        int flag=1;String h="";
        BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        System.out.print("\nHow much amount do you ");
        System.out.println("want to deposit to your account?");
        do
        {
            flag=0;
            try
            {
                h=br.readLine();
                if(Integer.parseInt(h)<0)
                {
                    throw new Exception();
                }
            }
            catch(Exception e)
            {
              System.out.println("Since you have entered a negative amount, the amount entered is invalid.Please re-enter it!");
              Thread.sleep(2000);
              flag=1;
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("C"))
        {
          double balance=fileReading.getCBalance(Bank.pan);
          balance=balance+Double.parseDouble(h);
          fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
          double updatedBalance=fileReading.getCBalance(Bank.pan);
          System.out.print("Your Account Balance is ");
          System.out.println("Rs "+updatedBalance);
          Thread.sleep(3500);
        }
        else if(Accounta.a_type.equals("S"))
        {
          double balance=fileReading.getSBalance(Bank.pan);
          balance=balance+Double.parseDouble(h);
          fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
          double updatedBalance=fileReading.getSBalance(Bank.pan);
          System.out.print("Your Account Balance is ");
          System.out.println("Rs "+updatedBalance);
          Thread.sleep(3500);
        }
    }
    static void withdrawFromSavings()throws Exception
    {   
          System.out.print("\u000c");
          ProjectHeader.headerLine();
          String h="";int flag=0;
          BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
          System.out.print("\nHow much amount do you want ");
          System.out.println("to withdraw from your account?");
          do
          {
            flag=0;
            try
            {
                h=br.readLine();
                if(Integer.parseInt(h)<0)
                {
                    throw new Exception();
                }
            }
            catch(Exception e)
            {
              System.out.println("Since you have entered a negative amount, the amount entered is invalid.Please re-enter it!");
              Thread.sleep(2000);
              flag=1;
            }
          }
          while(flag==1);
          Amount_drawn=Double.parseDouble(h);
          double balance=fileReading.getSBalance(Bank.pan);
          flag=0;
          if(Double.parseDouble(h)>balance)
          {
              System.out.print("Your Account Balance is less than the amount of money you want to withdraw.");
              System.out.println("Please deposit some amount of money");
              System.out.println("Press \n1. To re-enter withdrawal amount\n2. To Deposit some money\n3. To end transcation");
              do
              {
                  flag=0;
                  try
                  {
                      int i=Integer.parseInt(br.readLine());
                      if(i==1)
                      {
                          Thread.sleep(1000);
                          withdrawFromSavings();
                      }
                      else if(i==2)
                      {
                          Thread.sleep(1000);
                          userDeposit();
                      }
                      else if(i==3)
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
              balance=balance-Double.parseDouble(h);
              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
              double updatedBalance=fileReading.getSBalance(Bank.pan);
              System.out.print("Your Account Balance is ");
              System.out.println("Rs "+updatedBalance);
              Thread.sleep(2000);
          }
    }
    static void withdrawFromChecking()throws Exception
    {   
          System.out.print("\u000c");
          ProjectHeader.headerLine();
          String h="";int flag=0;
          BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
          System.out.print("\nHow much amount do you want ");
          System.out.println("to withdraw from your account?");
          do
          {
            flag=0;
            try
            {
                h=br.readLine();
                if(Integer.parseInt(h)<0)
                {
                    throw new Exception();
                }
            }
            catch(Exception e)
            {
              System.out.println("Since you have entered a negative amount, the amount entered is invalid.Please re-enter it!");
              Thread.sleep(2000);
              flag=1;
            }
          }
          while(flag==1);
          Amount_drawn=Double.parseDouble(h);
          double balance=fileReading.getCBalance(Bank.pan);
          flag=0;
          if(Double.parseDouble(h)>balance)
          {
              System.out.println("Your Account Balance is less than the amount of money you want to withdraw. Please deposit some amount of money\n");
              System.out.println("Press \n1. To re-enter withdrawal amount\n2. To Deposit some money\n3. To end transcation");
              do
              {
                  flag=0;
                  try
                  {
                      int i=Integer.parseInt(br.readLine());
                      if(i==1)
                      {
                          Thread.sleep(1000);
                          withdrawFromChecking();
                      }
                      else if(i==2)
                      {
                          Thread.sleep(1000);
                          userDeposit();
                      }
                      else if(i==3)
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
              balance=balance-Double.parseDouble(h);
              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
              double updatedBalance=fileReading.getCBalance(Bank.pan);
              System.out.print("Your Account Balance is ");
              System.out.println("Rs "+updatedBalance);
              Thread.sleep(2000);
          }
    }
}
    
