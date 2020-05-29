import java.io.*;
class Account_Type
{
    public static void type()throws Exception
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            try
            {
                flag=0;
                short choice=0 ;
                System.out.print("\u000c");
                ProjectHeader.headerLineForStarting();
                if(Accounta.age>=18)
                {
                    System.out.print("Please select the type of ");
                    System.out.println("account you want to create");
                    System.out.print("1 To create ");
                    System.out.println("a Savings Account");
                    System.out.print("2 To create ");
                    System.out.println("a Checkings Account");   
                    choice = Short.parseShort(br.readLine());
                }
                else 
                {
                    System.out.print("Press enter to ");
                    System.out.println("create a Savings Account");
                    br.read();
                    choice=1;
                }
                switch(choice)
                {
                    case 1 : System.out.print("\u000c");
                             Info.Savings_Account();
                             Accounta.a_type="S";
                             c(); 
                             break;
                    case 2 : System.out.print("\u000c");
                             Info.Checkings_Account();
                             Accounta.a_type="C";
                             c();
                             break;
                    default: throw new Exception(); 
                }   
            }
            catch(Exception e)
            {
                System.out.println("Invalid choice!");
                System.out.println("Please try again");
                flag=1;
            }
        }
        while(flag==1);
    }
    static void again()throws Exception
    {
        type();
    }
    static  void c()throws Exception
    {
       System.out.println("\nPress A to continue");
       System.out.println("Press B to return to menu");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String c=br.readLine();
        if(c.equalsIgnoreCase("b"))
            {
             System.out.print("\u000c");
             type();
            }
       else if (c.equalsIgnoreCase("a"))
            {   
                System.out.print("\u000c");
                Bank.pan=String.valueOf(7462359+(Math.round(Math.random()*10000)));
                Bank.Account=Long.parseLong(Bank.pan);
                for(int j=10;j>0;j--)
                {   
                  if(j<=6)
                  {
                    for(int d=2;d>0;d--)
                    {
                      ProjectHeader.headerLineForStarting();
                      System.out.print("\n\t\t\t\t\t\t\t\t         ");
                      System.out.print("The Account Number");
                      System.out.println(" is "+Bank.pan);
                      if(d%2==0)
                       {
                           System.out.print("\n\t\t\t\t\t\t\t     ");
                           System.out.print("Please note down your ");
                           System.out.print("Account Number in  ");
                           System.out.print(j+" seconds.");
                       }
                      Thread.sleep(650);
                      System.out.print("\u000c");
                    }
                  }
                  else
                  {
                      ProjectHeader.headerLineForStarting();
                      System.out.print("\n\t\t\t\t\t\t\t\t         ");
                      System.out.print("The Account Number");
                      System.out.println(" is "+Bank.pan);
                      System.out.print("\n\t\t\t\t\t\t\t     ");
                      System.out.print("Please note down your ");
                      System.out.print("Account Number in  ");
                      System.out.print(j+" seconds.");
                      Thread.sleep(998);
                      System.out.print("\u000c");
                    }      
                }
                System.out.print("\u000c");
                Thread.sleep(1000);
                Password_Generator.Password();
            }
       else {
              System.out.println("Invalid Choice");
              c();
            }
    }
}