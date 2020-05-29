import java.util.Date;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
class BeginApplication
{
    static void LogoStartPage()throws Exception
   {   
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("\u000c\n\n\n\n\n");
      Thread.sleep(200);
      int i,o,j;
      i=0;j=0; o=0;
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("\n\n\n\n\n");
      for(i=1;i<=7;i++)
            {  
              for(j=-4;j<=70;j++)
              {   
                if(i==1)
                {   
                    if(j>=-4 && j<=1 && o==0)
                    {     System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=9)
                     System.out.print("I ");
                    else 
                    if(j>=10 && j<=13)
                     System.out.print(" ");
                    else 
                    if(j>=14 && j<=21)
                     System.out.print("B ");
                    else
                    if(j>=26 && j<=30)
                     System.out.print(" ");
                    else
                    if(j>=32 && j<=39)
                     System.out.print("B ");
                    else 
                    if( j==41)
                     System.out.print(" ");
                }
                else if(i==2)
                {
                    if(j>=-4 && j<=1 && o==1)
                    {  
                        System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=8)
                     System.out.print(" ");
                    else 
                    if(j==10)
                     System.out.print("I ");
                    else 
                    if(j>=11 && j<=21)
                     System.out.print(" ");
                    else
                    if(j==23 || j==31)
                     System.out.print("B");
                    else if(j>=24 && j<=31)
                     System.out.print("  ");
                    else
                    if(j>=32 && j<=36)
                     System.out.print(" ");
                    else
                    if(j==37 || j==47)
                     System.out.print("B");
                    else if(j>=38 && j<=44)
                     System.out.print("  ");
                    else 
                    if( j==18 || j==24)
                     System.out.print("B");
                    else if(j>=19 && j<=23)
                     System.out.print(" ");
                }
                else if(i==3)
                {
                    if(j>=-4 && j<=1 && o==2)
                    {  
                        System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=8)
                     System.out.print(" ");
                    else 
                    if(j==10)
                     System.out.print("I ");
                    else 
                    if(j>=11 && j<=21)
                     System.out.print(" ");
                    else
                    if(j==23 || j==31)
                     System.out.print("B");
                    else if(j>=24 && j<=31)
                     System.out.print("  ");
                    else
                    if(j>=32 && j<=36)
                     System.out.print(" ");
                    else
                    if(j==37 || j==47)
                     System.out.print("B");
                    else if(j>=38 && j<=44)
                     System.out.print("  ");
                    else 
                    if( j==18 || j==24)
                     System.out.print("B");
                    else if(j>=19 && j<=23)
                     System.out.print(" ");
                }
                else if(i==4)
                {
                    if(j>=-4 && j<=1 && o==3)
                    {  
                        System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=8)
                     System.out.print(" ");
                    else 
                    if(j==10)
                     System.out.print("I ");
                    else if(j>=11 && j<=22)
                     System.out.print(" ");
                    else 
                    if(j>=23 && j<=30)
                     System.out.print("B ");
                    else
                    if(j>=37 && j<=41)
                     System.out.print(" ");
                    else
                    if(j>=43 && j<=50)
                     System.out.print("B ");
                    else 
                    if( j==52)
                     System.out.print(" ");
                }
                else if(i==5)
                {
                    if(j>=-4 && j<=1 && o==4)
                    {  
                        System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=8)
                     System.out.print(" ");
                    else 
                    if(j==10)
                     System.out.print("I ");
                    else 
                    if(j>=11 && j<=21)
                     System.out.print(" ");
                    else
                    if(j==23 || j==31)
                     System.out.print("B");
                    else if(j>=24 && j<=31)
                     System.out.print("  ");
                    else
                    if(j>=32 && j<=36)
                     System.out.print(" ");
                    else
                    if(j==37 || j==47)
                     System.out.print("B");
                    else if(j>=38 && j<=44)
                     System.out.print("  ");
                    else 
                    if( j==18 || j==24)
                     System.out.print("B");
                    else if(j>=19 && j<=23)
                     System.out.print(" ");
                }
                else if(i==6)
                {
                    if(j>=-4 && j<=1 && o==5)
                    {  
                        System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=8)
                     System.out.print(" ");
                    else 
                    if(j==10)
                     System.out.print("I ");
                    else 
                    if(j>=11 && j<=21)
                     System.out.print(" ");
                    else
                    if(j==23 || j==31)
                     System.out.print("B");
                    else if(j>=24 && j<=31)
                     System.out.print("  ");
                    else
                    if(j>=32 && j<=36)
                     System.out.print(" ");
                    else
                    if(j==37 || j==47)
                     System.out.print("B");
                    else if(j>=38 && j<=44)
                     System.out.print("  ");
                    else 
                    if( j==18 || j==24)
                     System.out.print("B");
                    else if(j>=19 && j<=23)
                     System.out.print(" ");
                }
                else if(i==7)
                {
                    if(j>=-4 && j<=1 && o==6)
                    {  
                        System.out.print("\t\t\t\t\t\t\t");o++;
                    }
                    if(j>=1 && j<=9)
                     System.out.print("I ");
                    else 
                    if(j>=10 && j<=13)
                     System.out.print(" ");
                    else 
                    if(j>=14 && j<=21)
                     System.out.print("B ");
                    else
                    if(j>=26 && j<=30)
                     System.out.print(" ");
                    else
                    if(j>=32 && j<=39)
                     System.out.print("B ");
                    else 
                    if( j==41)
                     System.out.print(" ");
                }
            }
            System.out.println();
          }
      Logo2();
   }
   static public  void Logo2()throws Exception
    {    
       DateFormat dateFormat = new SimpleDateFormat("HH");
       Date date = new Date();
       String s=dateFormat.format(date);
       if(Integer.parseInt(s)<5|| Integer.parseInt(s)>21)
            {
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t");
                System.out.println("             OOPS! ");
                                System.out.print("\n\t\t\t\t\t\t\t\t      ");
                System.out.println("Server is under maintainence work");
                System.out.print("\n \t\t\t\t\t\t\t\t\t    ");
                System.out.println("Please try again later");
            }
            else
            {
                logo2();
            }
    }
   static void logo2()throws Exception
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s="PRESS ENTER TO START";
       s=s+" ";
       Thread.sleep(1000);
       System.out.print("\n\n\t\t\t\t\t\t\t\t\t    ");
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           for(int j=0;j<1;j++) 
             {
                 String m="";m=m+ch;
                 System.out.print(m);
                 Thread.sleep(80);
             }
       }
       System.out.println();
       String a="";
       System.out.print("\n\t\t\t\t\t\t\t\t\t\t    ");
       int flag=1;
       do
       {
           try
           {
               flag=0;
               String s1=br.readLine();
               if(s1.equalsIgnoreCase(a))
                      flag=0;
               else
                      throw new Exception();
           }
           catch(Exception e)
           {
               LogoStartPage();
               flag=1;
           }
       }
       while(flag==1);
       System.out.print("\n\t\t\t\t\t\t\t\t\t    ");
       for(int j=0;j<=18;j++)
       {
          System.out.print(".");
          Thread.sleep(80);
       }
       System.out.println();
       ProjectHeader.loading();
       Thread.sleep(200);
       l();
   }
   public static void l()throws Exception
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=1;
        int n=0;
        do
        {
            try
            {
                if(flag==1)
                {
                    Thread.sleep(1000);
                    System.out.print("\u000c");
                    System.out.print("\n\n\n\n\n\n\n\n");
                    System.out.println("\n\n\n\n\n\n\n");
                    DesignCreator.IBB();
                    Thread.sleep(1000);
                    System.out.print("\n\t\t\t\t\t\t\t    ");
                    System.out.println("1 Create New Account");
                    Thread.sleep(100);
                    System.out.print("\t\t\t\t\t\t\t    ");
                    System.out.println("2 Login");
                    Thread.sleep(100);
                    System.out.print("\t\t\t\t\t\t\t    ");
                    System.out.println("3 About Us");
                    Thread.sleep(100);
                    System.out.print("\t\t\t\t\t\t\t    ");
                    System.out.println("4 Quit");
                    Thread.sleep(100);
                }    
                flag=0;
                System.out.print("\t\t\t\t\t\t\t    ");
                n=Integer.parseInt(br.readLine());
                if(n<1 || n>4)
                   throw new Exception();
            }
            catch(Exception e)        
            {
                System.out.println("\nInvalid menu option entered.");
                System.out.println("Please enter a valid option");
                flag=1;
            }
        }
        while(flag==1);
        switch(n)
        {
            case 1:System.out.println("\u000c");
                   Accounta.Account_creation();
                   break;
            case 2:System.out.println("\u000c");
                   Login.login();
                   break;
            case 3:System.out.println("\u000c");
                   Info.bankInfo();
                   break;
            case 4:System.out.println("\u000c");
                   EndApplication.end();
                   break; 
        }
    }
}   