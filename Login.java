import java.io.*;
class Login
{   
    static int m=0;
    static int q=0;
    static String l="";
    static int b=0;
    public static void login()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        DesignCreator.IBB();
        System.out.print("\n\n\t\t\t\t\t\t\t\t      ");
        System.out.print("Enter your Account Number : ");
        l=br.readLine();
        int i;int a=0;
        pass();
    }
    static void lcheck()throws Exception
    {
        login();
    }
    public static void pass()throws Exception
    {   int i=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\t\t\t\t\t\t\t\t      ");
        System.out.print("Enter Password :  ");
        String s=br.readLine();
        if(checkLogin(l,s))
        {
            Bank.pan=l;
            Thread.sleep(2000);
            System.out.println("\t\t\t\t\t\t\t                           Login Success");
            fileReading.readCompleteCred(Bank.pan);
            Thread.sleep(2000);
            Bank_Menu.display_Menu();
        }
        else
        {
            System.out.println("Login Failure");
            Thread.sleep(1500);
            login();
        }
    }
    static boolean checkLogin(String id,String password)throws Exception
    {
       boolean check = false;
       String s[]=fileReading.readCred(id);
       try
       {   
        if(!"".equals(s))
        {
           String uName = s[0];
           String pWord = s[1];
           if(uName.equals(id))
           {
              if(password.equals(pWord))
              {
                check=true;
              }
              else
              {
                System.out.println("Password is incorrect");
              }
           }
          else
          {
                System.out.println("No account with entered Account ID");            
          }
        }
        else
        {
           check=false;
           System.out.println("\t\t\t\t\tNo account with entered Account ID");
        }
       }
       catch(NullPointerException e)
       {
         System.out.print("\t\t\t\t\t\t\t      There are no accounts with that Account Number and Password.");
         System.out.println("\n\t\t\t\t\t Make sure you create one or Check whether the Account Number or Password that you have entered is correct"); 
         Thread.sleep(6000);
         b++;
         BeginApplication.l();
       }
       return check;
    }
}

