import java.io.*;
class Password_Generator
{
    static String special;
    public static void Password()throws Exception
    {   
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String id=Accounta.ID;
        double a=Math.random()*(13387-22273)+22273;
        for(int i=1;i<4;i++)
           {
             System.out.print("\u000c");
             ProjectHeader.headerLineForStarting();
             System.out.print("\n\n\t\t\t\t\t\t\t   ");
             System.out.print("PLEASE WAIT WHILE YOUR ");
             System.out.print("PASSWORD IS BEING GENERATED ");
             for(int j=1;j<=11;j++)
                {
                  System.out.print(".");
                  Thread.sleep(100);
                }
             System.out.print("\u000c");
           }
        System.out.println();
        Thread.sleep(600);
        Bank.Password="IND74283A"+(int)a;
          for(int j=15;j>0;j--)
         {   
           if(j<=6)
           {
             for(int d=2;d>0;d--)
             {
               ProjectHeader.headerLineForStarting();
               System.out.print("\n\t\t\t\t\t\t\t\t        ");
               System.out.println("The password is "+Bank.Password);
               if(d%2==0)
               {
                   System.out.print("\n\t\t\t\t\t\t\t        ");
                   System.out.print("Please note down your password in  ");
                   System.out.print(j+" seconds.");
               }
               Thread.sleep(650);
               System.out.println("\u000c");
             }
           }
           else
           {
             ProjectHeader.headerLineForStarting();
             System.out.print("\n\t\t\t\t\t\t\t\t        ");
             System.out.println("The password is "+Bank.Password);
             System.out.print("\n\t\t\t\t\t\t\t        ");
             System.out.print("Please note down your password in  ");
             System.out.print(j+" seconds.");
             Thread.sleep(998);
             System.out.println("\u000c");
           }      
        }
        System.out.println("\u000c");
        Account_Information.Info();
    }
}