import java.io.*;
class Cheque
{
    static long a;
    static double mon;
    static int forCheck=0;
    static void acc()throws Exception
    {   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");
        q();
    }
    static void q()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        System.out.println("Press");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Bank Menu");
        int flag=0;
        int choice=0;
        do
        {
            flag=0;
            try
            {
                choice=Integer.parseInt(br.readLine());
                if(choice==1)
                    userDeposit(); 
                else if(choice==2)
                {
                    if(Accounta.a_type.equals("S"))
                    {
                        withdrawFromSavings();
                    }
                    else if(Accounta.a_type.equals("C"))
                    {
                        withdrawFromCheckings();
                    }
                }
                else if(choice==3)
                {
                    Bank_Menu.display_Menu();
                }
                else
                    throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Enter a valid menu choice");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void userDeposit()throws Exception
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double h=0;
        int flag=0;
        do
        {
            try
            {
                flag=0;
                System.out.print("\u000c");
                ProjectHeader.headerLine();
                System.out.println("\nHow much amount do you want to deposit to your account?");
                h=Double.parseDouble(br.readLine());
                if(h<1)
                        throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Invalid amount entered!");
                System.out.println("Please try again");
                flag=1;
                Thread.sleep(1500);
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("C"))
        {
          double balance=fileReading.getCBalance(Bank.pan);
          balance=balance+h;
          fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
          double updatedBalance=fileReading.getCBalance(Bank.pan);
          System.out.println("Your Account Balance is Rs "+updatedBalance);
          Thread.sleep(2000);
        }
        else if(Accounta.a_type.equals("S"))
        {
          double balance=fileReading.getSBalance(Bank.pan);
          balance=balance+h;
          fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
          double updatedBalance=fileReading.getSBalance(Bank.pan);
          System.out.println("Your Account Balance is Rs "+updatedBalance);
          Thread.sleep(2000);
        }
        q();
    }
    static void withdrawFromSavings()throws Exception
    {   
          System.out.println("\u000c");
          ProjectHeader.headerLine();
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("\nHow much amount do you want to withdraw to your account?");
          String h=br.readLine();
          double Amount_drawn=Double.parseDouble(h);
          double balance=fileReading.getSBalance(Bank.pan);int flag=0;
          if(Integer.parseInt(h)<0)
          {
              System.out.println("Amount entered is invalid. Please enter again");
              Thread.sleep(2000);
              withdrawFromSavings();
          }
          if(balance<Amount_drawn)
          {
              System.out.println("CHEQUE BOUNCE!\nAccount balance is not sufficicant\nDo you want to deposit some money\n IF YES press Y Else N");
              do
              {
                  flag=0;
                  try
                  {
                      String choice=br.readLine();
                      if(choice.equalsIgnoreCase("Y"))
                      {
                            Money.userDeposit();
                            q();
                      }
                      else if(choice.equalsIgnoreCase("N"))
                      {
                            System.out.println("\nAccount balance is not sufficicant\n");
                            System.out.println("Returning to Bank Menu");
                            Thread.sleep(1000);
                            Bank_Menu.display_Menu();
                      }
                      else
                            throw new Exception();
                  }
                  catch(Exception e)
                  {
                      System.out.println("Enter a valid menu choice");
                      Thread.sleep(2500);
                      flag=1;
                    }
              }
              while(flag==1);
          }
          else 
          {
              balance=balance-Double.parseDouble(h);
              System.out.println("Cheque Passed!");
              DesignCreator.chequeEnvelop();
              br.read();
              fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
              double updatedBalance=fileReading.getSBalance(Bank.pan);
              System.out.println("Your Account Balance is Rs "+updatedBalance);
              Thread.sleep(2000);
              System.out.print("\u000c");
              q();
          }
    }
    static void withdrawFromCheckings()throws Exception
    {   
          System.out.println("\u000c");
          ProjectHeader.headerLine();
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("\nHow much amount do you want to withdraw form your account?");
          String h=br.readLine();
          double Amount_drawn=Double.parseDouble(h);
          double balance=fileReading.getCBalance(Bank.pan);int flag=0;
          if(Integer.parseInt(h)<0)
          {
              System.out.println("Amount entered is invalid. Please enter again");
              Thread.sleep(2000);
              withdrawFromCheckings();
          }
          if(balance<Amount_drawn)
          {
              System.out.println("CHEQUE BOUNCE!\nAccount balance is not sufficicant\nDo you want to deposit some money\n IF YES press Y Else N");
              do
              {
                  flag=0;
                  try
                  {
                      String choice=br.readLine();
                      if(choice.equalsIgnoreCase("Y"))
                      {      
                             Money.userDeposit();
                             q();
                      }
                      else if(choice.equalsIgnoreCase("N"))
                      {
                            System.out.println("\nAccount balance is not sufficicant\n");
                            System.out.println("Returning to Bank Menu");
                            Thread.sleep(1000);
                            Bank_Menu.display_Menu();
                      }
                      else
                            throw new Exception();
                  }
                  catch(Exception e)
                  {
                      System.out.println("Enter a valid menu choice");
                      Thread.sleep(2500);
                      flag=1;
                    }
              }
              while(flag==1);
          }
          else 
          {
              balance=balance-Double.parseDouble(h);
              System.out.println("Cheque Passed!");
              DesignCreator.chequeEnvelop();
              br.read();
              fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
              double updatedBalance=fileReading.getCBalance(Bank.pan);
              System.out.println("Your Account Balance is Rs "+updatedBalance);
              Thread.sleep(2000);
              forCheck=0;
              System.out.print("\u000c");
              q();
          }
    }
}        