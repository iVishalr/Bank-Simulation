import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class DesignCreator
{
    static void IBB2()
    {
        int i;int j;
        System.out.print("\t\t\t\t\t\t\t");
        for(i=1;i<66;i++)
               System.out.print("-");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t");
        System.out.print("|"); 
        for(i=1;i<64;i++)
               System.out.print(" ");
        System.out.println("|");        
        for(i=1;i<=7;i++)
        {
            if(i==1 || i==7)
            {
               System.out.print("\t\t\t\t\t\t\t");
               System.out.print("|   ");
               for(j=1;j<=9;j++)
                    System.out.print("I ");
               for(j=1;j<=3;j++)
                    System.out.print(' ');
               for(j=1;j<=8;j++)
                    System.out.print("B ");
               for(j=1;j<=5;j++)
                    System.out.print(' ');
               for(j=1;j<=8;j++)
                    System.out.print("B ");
               System.out.print("  |");     
               System.out.println();
            }
            else if(i-1==3)
            {
               System.out.print("\t\t\t\t\t\t\t");
               System.out.print("|   ");
               for(j=1;j<=8;j++)
                       System.out.print(' ');
               System.out.print('I');
               for(j=1;j<=5;j++)
                       System.out.print(' ');
               for(j=1;j<=7;j++)
                       System.out.print(' ');
               for(j=1;j<=8;j++)
                       System.out.print("B ");
               for(j=1;j<=5;j++)
                       System.out.print(' ');
               for(j=1;j<=8;j++)
                       System.out.print("B ");
               System.out.print("  |");        
               System.out.println();
            }
            else 
            {
               System.out.print("\t\t\t\t\t\t\t");
               System.out.print("|   ");
               for(j=1;j<=8;j++)
                       System.out.print(' ');
               System.out.print('I');
               for(j=1;j<=5;j++)
                       System.out.print(' ');
               for(j=1;j<=7;j++)
                       System.out.print(' ');
                      System.out.print('B');
               for(j=1;j<=14;j++)
                       System.out.print(' ');
                      System.out.print('B');
               for(j=1;j<=5;j++)
                       System.out.print(' ');
                      System.out.print('B');
               for(j=1;j<=14;j++)
                       System.out.print(' ');
               System.out.print('B');
               System.out.print("  |");
               System.out.println(); 
            }
        }
        System.out.print("\t\t\t\t\t\t\t");
        System.out.print("|"); 
        for(i=1;i<64;i++)
               System.out.print(" ");
        System.out.println("|");    
        System.out.print("\t\t\t\t\t\t\t");
        for(i=1;i<66;i++)
               System.out.print("-");
    }
    static void startDesign()throws Exception
    {
        System.out.println();
        Thread.sleep(1000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        IBB2();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     PRESENTS");
        Thread.sleep(2500);
        VB();
        System.out.println("\u000C");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t   POWERED");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t      BY");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t    BLUEJ");
        Thread.sleep(1500);
        System.out.print("\u000c");
        BLUEJ();
        Thread.sleep(2000);
        BeginApplication.LogoStartPage();
    }
    static void BLUEJ()
    {
        String s="BLUEJ";
        int l=s.length();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for(int i=0;i<=l-1;i++)
        {
            System.out.print("\t\t\t\t\t\t\t\t\t\t");
            for(int j=l-1;j>i;j--)
                System.out.print("  ");
            for(int j=i;j<=i;j++)
                System.out.print(s.charAt(j)+" ");
            if(i>=0 && i<=l-2)
            {
              for(int j=1;j<=i;j++)
                System.out.print("  ");
              for(int j=1;j<i;j++)
                System.out.print("  ");
            }
            for(int j=i;j<=i;j++)
            {
                if(i==0)
                    continue;
                if(j==l-1)
                    break;
                System.out.print(s.charAt(j)+" ");
            }
            if(i==l-1)
            {
              for(int j=l-1;j>=0;j--)
                { 
                 if(j==l-1)
                   continue;
                 System.out.print(s.charAt(j)+" ");
                }
              for(int j=0;j<=l-1;j++)
                {
                 if(j==0)
                   continue;
                 System.out.print(s.charAt(j)+" ");
                }
            }
            System.out.println();
        }
    }
    static void VB()throws Exception
    {
        System.out.print("\u000c");
        for(int i=30;i>14;i--)
        {
            for(int j=0;j<=i;j++)
                  System.out.println();   
            System.out.println("\t\t\t\t\t\t\t\t V       V                                               ");            
            System.out.println("\t\t\t\t\t\t\t\t  V     V                                                "); 
            System.out.println("\t\t\t\t\t\t\t\t   V   V    III  RRR   TTTTT  U  U    A    L             ");                             
            System.out.println("\t\t\t\t\t\t\t\t    V V      I   RRR     T    U  U   AAA   L             "); 
            System.out.println("\t\t\t\t\t\t\t\t     V      III  R  R    T    UUUU  A   A  LLLLL         "); 
            System.out.println();                            
            System.out.println("\t\t\t\t\t\t\t\tB B B B                                                 ");                                                                                                  
            System.out.println("\t\t\t\t\t\t\t\tB      B                                                ");                                                
            System.out.println("\t\t\t\t\t\t\t\tB B B B     A    NN  N  K   K  III  NN  N  GGG          ");                                                 
            System.out.println("\t\t\t\t\t\t\t\tB      B   AAA   N N N  K K     I   N N N  G   GG       ");                    
            System.out.println("\t\t\t\t\t\t\t\tB B B B   A   A  N  NN  K   K  III  N  NN  GGGG G       "); 
            System.out.println("\t\t\t\t\t\t\t\t                                                G       ");  
            Thread.sleep(100);
            if(i>15)
                  System.out.print("\u000c");
        }
        Thread.sleep(2000);
    }
    static void IBB()throws Exception
    {
        int i;int j;
        for(i=1;i<=7;i++)
        {
            if(i==1 || i==7)
            {
               System.out.print("\t\t\t\t\t\t\t    ");
               for(j=1;j<=9;j++)
                    System.out.print("I ");
               for(j=1;j<=3;j++)
                    System.out.print(' ');
               for(j=1;j<=8;j++)
                    System.out.print("B ");
               for(j=1;j<=5;j++)
                    System.out.print(' ');
               for(j=1;j<=8;j++)
                    System.out.print("B ");
               System.out.println();
            }
            else if(i-1==3)
            {
               System.out.print("\t\t\t\t\t\t\t    ");
               for(j=1;j<=8;j++)
                       System.out.print(' ');
               System.out.print('I');
               for(j=1;j<=5;j++)
                       System.out.print(' ');
               for(j=1;j<=7;j++)
                       System.out.print(' ');
               for(j=1;j<=8;j++)
                       System.out.print("B ");
               for(j=1;j<=5;j++)
                       System.out.print(' ');
               for(j=1;j<=8;j++)
                       System.out.print("B ");
               System.out.println();
            }
            else 
            {
               System.out.print("\t\t\t\t\t\t\t    ");
               for(j=1;j<=8;j++)
                       System.out.print(' ');
               System.out.print('I');
               for(j=1;j<=5;j++)
                       System.out.print(' ');
               for(j=1;j<=7;j++)
                       System.out.print(' ');
                      System.out.print('B');
               for(j=1;j<=14;j++)
                       System.out.print(' ');
                      System.out.print('B');
               for(j=1;j<=5;j++)
                       System.out.print(' ');
                      System.out.print('B');
               for(j=1;j<=14;j++)
                       System.out.print(' ');
               System.out.print('B');
               System.out.println(); 
            }
        }
    }
    static void atmDesign()throws Exception
    {
        System.out.println("\t\t\t\t\t\t\t            ----------------------------------------");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |    ------------------------------    |");
        System.out.println("\t\t\t\t\t\t\t            |    |                            |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |                            |    |");        
        System.out.println("\t\t\t\t\t\t\t            |    |   IIIII  BBBBBB   BBBBBB   |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |     I    B     B  B     B  |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |     I    BBBBBB   BBBBBB   |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |     I    B     B  B     B  |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |   IIIII  BBBBBB   BBBBBB   |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |                            |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |        ATM Machine         |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |                            |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |   PRESS ENTER TO INSERT    |    |");
        System.out.println("\t\t\t\t\t\t\t            |    |           CARD             |    |");
        System.out.println("\t\t\t\t\t\t\t            |    ------------------------------    |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |     |------------|   |----------|    |");
        System.out.println("\t\t\t\t\t\t\t            |     |------------|   |----------|    |");
        System.out.println("\t\t\t\t\t\t\t            |        Receipt            Card       |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |    ------------------------------    |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |         1      2     3     4         |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |         5      6     7     8         |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |         9      0      Enter          |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |    ------------------------------    |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            |                                      |");
        System.out.println("\t\t\t\t\t\t\t            ----------------------------------------");                                     
        System.out.println("\t\t\t\t\t\t\t            ");
    }
    static void chequeEnvelop()throws Exception
    {
        System.out.println("\n\n\t\t\t\t\t\t\t                 ..            ..");
        System.out.println("\t\t\t\t\t\t\t                  ..          ..");
        System.out.println("\t\t\t\t\t\t\t                   ..        ..");
        System.out.println("\t\t\t\t\t\t\t                    ..      ..");
        System.out.println("\t\t\t\t\t\t\t                     ..    ..");
        System.out.println("\t\t\t\t\t\t\t                      ..  ..");
        System.out.println("\t\t\t\t\t\t\t                        ..");
        System.out.println("\t\t\t\t\t\t\t              ");
        System.out.println("\t\t\t\t\t\t\t                 ..            ..");
        System.out.println("\t\t\t\t\t\t\t                  ..          ..");
        System.out.println("\t\t\t\t\t\t\t                   ..        ..");
        System.out.println("\t\t\t\t\t\t\t                    ..      ..");
        System.out.println("\t\t\t\t\t\t\t                     ..    ..");
        System.out.println("\t\t\t\t\t\t\t                      ..  ..");
        System.out.println("\t\t\t\t\t\t\t                        ..");
        System.out.println("\t\t\t\t\t\t\t __________________________________________________             ");
        System.out.println("\t\t\t\t\t\t\t |\\                                              /|             "); 
        System.out.println("\t\t\t\t\t\t\t | \\                                            / |             "); 
        System.out.println("\t\t\t\t\t\t\t |  \\                                          /  |             "); 
        System.out.println("\t\t\t\t\t\t\t |   \\                                        /   |             "); 
        System.out.println("\t\t\t\t\t\t\t |    \\______________________________________/    |             "); 
        System.out.println("\t\t\t\t\t\t\t |                                                |             "); 
        System.out.println("\t\t\t\t\t\t\t |                                                |             "); 
        System.out.println("\t\t\t\t\t\t\t |              PRESS ENTER TO INSERT             |             "); 
        System.out.println("\t\t\t\t\t\t\t |                                                |             "); 
        System.out.println("\t\t\t\t\t\t\t |                                                |             "); 
        System.out.println("\t\t\t\t\t\t\t |________________________________________________|             "); 
    } 
    static void foreignExchange()throws Exception
    {
        System.out.println("\n\n");
        System.out.println("\t\t\t\t              S                                                                P                       C  C  C      ");
        System.out.println("\t\t\t\t              S            R R R R R R R R R R R R R R R R R                 P    P                  C          C   ");
        System.out.println("\t\t\t\t             S S                                R                           P       P               C            C  ");
        System.out.println("\t\t\t\t         S    S   S                              R                         P                      C                 ");
        System.out.println("\t\t\t\t        S     S      S                            R                       P                      C                  ");
        System.out.println("\t\t\t\t         S    S             R R R R R R R R R R R RR R R R R             P                      C                   ");
        System.out.println("\t\t\t\t           S  S                                  R                      P                      C                    ");
        System.out.println("\t\t\t\t              S                                 R              P P P P P P P P P     CCCCCCCCCCCCCCCCCCCCCCCCCCC    ");  
        System.out.println("\t\t\t\t              S   S             R R R R R R R  R                      P                       C                     ");
        System.out.println("\t\t\t\t              S     S           R                                      P             CCCCCCCCCCCCCCCCCCCCCCCCCCC    ");
        System.out.println("\t\t\t\t              S       S           R                                     P                     C                     ");
        System.out.println("\t\t\t\t        S     S      S              R                                  P                       C                    "); 
        System.out.println("\t\t\t\t          S   S     S                 R                               P                         C                   ");
        System.out.println("\t\t\t\t             S S  S                     R                           P                            C                  ");
        System.out.println("\t\t\t\t              S                           R                       P                               C               C ");
        System.out.println("\t\t\t\t              S                             R                   P                                   C            C  ");
        System.out.println("\t\t\t\t                                                               P P P P P P P P P P P P P               C  C  C\n\n      "); 
        for(int i=0;i<179;i++)
        {
            System.out.print("_");
        }
        System.out.println();
    }  
    static void newsLineDisplay()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="1 US $ = Rs 67.97     1 EURO = Rs 72.65     1 BRITISH POUND = Rs 84.53     1 US $ = Rs 67.97     1 EURO = Rs 72.65     1 BRITISH POUND = Rs 84.53     ";
        System.out.println("\t\t");
        for(int i=1;i<=(2*s.length());i++)
        {
            ProjectHeader.headerLine();
            foreignExchange();
            String a=s.substring(1)+s.charAt(0);
            System.out.println("\n\t\t" + a);
            s=a;
            Thread.sleep(100);
            System.out.print("\u000c");
        }
    }
    static void IBBSecurityGenerator()
    {
        String s="IBB";
        int l=s.length();
        System.out.println();
        for(int i=0;i<=l-1;i++)
        {
            System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
            for(int j=l-1;j>i;j--)
                System.out.print("  ");
            for(int j=i;j<=i;j++)
                System.out.print(s.charAt(j)+" ");
            if(i>=0 && i<=l-2)
            {
              for(int j=1;j<=i;j++)
                System.out.print("  ");
              for(int j=1;j<i;j++)
                System.out.print("  ");
            }
            for(int j=i;j<=i;j++)
            {
                if(i==0)
                    continue;
                if(j==l-1)
                    break;
                System.out.print(s.charAt(j)+" ");
            }
            if(i==l-1)
            {
              for(int j=l-1;j>=0;j--)
                { 
                 if(j==l-1)
                   continue;
                 System.out.print(s.charAt(j)+" ");
                }
              for(int j=0;j<=l-1;j++)
                {
                 if(j==0)
                   continue;
                 System.out.print(s.charAt(j)+" ");
                }
            }
            System.out.println();
        }
    }
    static void IBBSecurityGenerator2()
    {
        String s="IBB";
        int l=s.length();
        for(int i=l-2;i>=0;i--)
        {
            System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
            for(int j=i;j<l-1;j++)
              System.out.print("  ");
            for(int j=i;j<=i;j++)
              System.out.print(s.charAt(j)+" ");
            if(i<=l-2 && i>=0)
            {
              for(int j=i;j>=1;j--)
                System.out.print("  ");
              for(int j=i;j>1;j--)
                System.out.print("  ");
            }
            for(int j=i;j<=i;j++)
            {
                if(i==l-1)
                    continue;
                if(j==0)
                    break;
                System.out.print(s.charAt(j)+" ");
            }
            if(i==l-1)
            {
              for(int j=l-1;j>=0;j--)
                { 
                  if(j==l-1)
                   continue;
                  System.out.print(s.charAt(j)+" ");
                }
              for(int j=0;j<=l-1;j++)
                {
                  if(j==0)
                   continue;
                  System.out.print(s.charAt(j)+" ");
                }
            }
            System.out.println();
        }
    }
}