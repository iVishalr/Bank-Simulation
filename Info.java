import java.io.*;
class Info
{ 
    static int g=0;
    static void bankInfo()throws Exception
     {
        int i;BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a="WELCOME";
        int l=a.length();
        String b="TO";
        int l1=b.length();
        String c="INTERNATIONAL BANK OF BENGALURU";
        int l2=c.length();
        System.out.print("\t\t\t\t\t\t\t\t\t        ");     
        for(i=0;i<l;i++)
         {   char ch=a.charAt(i);
             for(int j=0;j<1;j++)
             {  String m="";m=m+ch;
                 System.out.print(m);
                 Thread.sleep(230);
             }
         }
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t                   ");
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
        System.out.print("\t\t\t\t\t\t\t           ");
        for(i=0;i<l2;i++)
         {
             char ch=c.charAt(i);
             for(int j=0;j<1;j++)
             {
                 System.out.print(ch);
                 Thread.sleep(100);
                }
        }
        p();
    }
    static void Infol()throws Exception
    {
        System.out.println("\n");
        int j=0;int i=0;
        int o=0;
        for(i=1;i<=7;i++)
        {  
            for(j=-4;j<=170;j++)
            {   
                if(i==1)
                {   
                    if(j>=-4 && j<=1 && o==0)
                    {     System.out.print("\t\t\t\t\t\t     ");o++;
                      
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
                        System.out.print("\t\t\t\t\t\t     ");o++;
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
                        System.out.print("\t\t\t\t\t\t     ");o++;
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
                       System.out.print("\t\t\t\t\t\t     ");o++;
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
                        System.out.print("\t\t\t\t\t\t     ");o++;
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
                       System.out.print("\t\t\t\t\t\t     ");o++;
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
                        System.out.print("\t\t\t\t\t\t     ");o++;
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
        if(g!=1)
          k();
    }
    static void k()throws Exception
    {   int i=0;
        Thread.sleep(1000);
        for(i=0;i<=179;i++)
          System.out.print("_");
        p();
    }
    static void c()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BeginApplication.l();
        br.read();
        System.out.println(" \u000c");
    } 
    static void p()throws Exception
    {    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println();
        for(int i=0;i<=179;i++)
            System.out.print("_");
        Thread.sleep(1000);
        System.out.println("\n\n \t\t\t\t\t        International Bank Of Bengaluru was founded by Aaditya and Vishal in \n       \t\t  \t\t \t                   the year 2010 in the Silicon Valley of India.\n");
        Thread.sleep(1000);
        System.out.print("  ");
        for(int i=0;i<=173;i++)
            System.out.print("_");
        System.out.println();    
        Thread.sleep(2000);
        System.out.print("  --------------------------------------------------------------------------------------");
        System.out.println("  --------------------------------------------------------------------------------------");
          System.out.print("  |                                                                                    |");
        System.out.println("  |                                                                                    |");
          System.out.print("  |                                 BANKING :-                                         |");
        System.out.println("  |                                 BRANCHES:-                                         |");  
          System.out.print("  |                                 -------                                            |");
        System.out.println("  |                                 --------                                           |");  
          System.out.print("  |                                                                                    |");
        System.out.println("  |                                                                                    |");  
          System.out.print("  |  Banks act as payment agents by conducting checking or current                     |");
        System.out.println("  |  International Bank Of Bengaluru has its braches in the major cities of            |");
          System.out.print("  |  accounts for customers, paying cheques drawn by customers on the                  |");
        System.out.println("  |  India and also in the world.                                                      |");
          System.out.print("  |  bank, and collecting cheques deposited to customers' current                      |");
        System.out.println("  |                                                                                    |");
          System.out.print("  |  accounts. Banks also enable customer payments via other payment                   |");
        System.out.println("  |  Headquaters is in Bengaluru. Other braches are in -                               |");
          System.out.print("  |  methods such as Automated Clearing House (ACH), Wire transfers or                 |");
        System.out.println("  |                                                                                    |");
          System.out.print("  |  telegraphic transfer, EFTPOS, and automated teller machines                       |"); 
        System.out.println("  |  INDIA - Mumbai , Chennai , Pune , Hydrabad , NewDelhi , Kolkata , Noida ,         |");
          System.out.print("  |  ATMs.                                                                             |");
        System.out.println("  |  -----   Ahmadabad , Mysore , Chandigarh , Kochi , Vizac , and other small cities. |");  
          System.out.print("  |                                                                                    |");
        System.out.println("  |                                                                                    |");  
                                                           Thread.sleep(500);
          System.out.print("  |  Banks borrow money by accepting funds deposited on current                        |");
        System.out.println("  |  WORLD - NewYork City , Sydney , Melbourne , Wellington , LosAngeles , London ,    |");  
          System.out.print("  |  accounts, by accepting term deposits, and by issuing debt securities              |");
        System.out.println("  |  -----   Barcelona , Paris , Berlin , Moscow , Dubai , and conting.                |");  
          System.out.print("  |  such as banknotes and bonds. Banks lend money by making advances to customers     |");
        System.out.println("  |                                                                                    |"); 
          System.out.print("  |  on current accounts, by making installment loans, and by investing in marketable  |");
        System.out.println("  |                                 CONTACTS:-                                         |");   
          System.out.print("  |  debt securities and other forms of money lending.                                 |");
        System.out.println("  |                                 --------                                           |");  
          System.out.print("  |                                                                                    |");
        System.out.println("  |                                                                                    |");
                                                          Thread.sleep(500);
          System.out.print("  |  Banks provide different payment services, and a bank                              |");
        System.out.println("  |           Telephone : Main Branch : 080912873465                                   |");  
          System.out.print("  |  account is considered indispensable by most businesses and individuals. Non-      |");
        System.out.println("  |                                     080918276354                                   |");  
          System.out.print("  |  banks that provide payment services such as remittance companies                  |");
        System.out.println("  |           E-Mail : IBB.info@gmail.com                                              |");  
          System.out.print("  |  are normally not considered as an adequate substitutefor a bank account.          |");
        System.out.println("  |                   IBB.info.bengaluru@gmail.com                                     |");  
          System.out.print("  |                                                                                    |");
        System.out.println("  |           Phone : 9343565767                                                       |");  
                                                           Thread.sleep(500);
          System.out.print("  |  Banks can create new money when they make a loan. New loans                       |");
        System.out.println("  |                                                                                    |");  
          System.out.print("  |  throughout the banking system generate new deposits elsewhere in                  |");
        System.out.println("  |                                 Address :-                                         |");
          System.out.print("  |  the system. The money supply is usually increased by the act of                   |");
        System.out.println("  |                                 -------                                            |");  
          System.out.print("  |  lending, and reduced when loans are repaid faster than new ones are               |");
        System.out.println("  |                                                                                    |");  
          System.out.print("  |  lending, and reduced when loans are repaid faster than new ones are               |");
        System.out.println("  |        Main Branch  : International Bank Of Bengaluru ,                            |");    
          System.out.print("  |  generated. In the United Kingdom between 1997 and 2007, there was                 |");
        System.out.println("  |                             3/125 , K G Road ,                                     |");    
          System.out.print("  |  an increase in the money supply, largely caused by much more bank                 |");
        System.out.println("  |                      Majestic , BENGALURU - 560009 ,                               |");  
          System.out.print("  |  lending, which served to push up property prices and increase private             |");
        System.out.println("  |                           Karnataka , India .                                      |");  
          System.out.print("  |  debt.                                                                             |");
        System.out.println("  |                                                                                    |");  
          System.out.print("  |                                                                                    |");
        System.out.println("  |                                                                                    |");   
        Thread.sleep(1000);
        System.out.print("  ");
        for(int i=0;i<=173;i++)
            System.out.print("-");
        System.out.println();
        Thread.sleep(2000);
         System.out.println("                        \t\t\tPress enter key to continue OR If you want to view our Employee Details Press SHOW ");
         int flag=0;
        do
         {
             flag=0;
             try
             {
                 String choice=br.readLine();
                 if(choice.equals(""))
                 {
                     Login.b++;BeginApplication.l();
                 }
                 else if(choice.equals("SHOW"))
                 {
                     Employees e=new Employees();
                     e.employees();
                 }
                 else 
                     throw new Exception();
             }
             catch(Exception e)
             {
                 System.out.println("Enter the correct menu choice.");
                 flag=1;
             }
         }
         while(flag==1);
     }
     static void Checkings_Account()throws Exception
     {
         ProjectHeader.headerLineForStarting();
         System.out.println("\nWhat is a Checkings Account?");
         System.out.print("Answer - ");
         System.out.print("A transaction account, checking account, or demand deposit account is a deposit account held at a bank or other financial institution.\n");
         System.out.print("         It is available to the account owner on demand and is available for frequent and immediate access by the account owner or to others \n");
         System.out.print("         as the account owner may direct. Access may be in a variety of ways, such as cash withdrawals, use of cheques and debit by electronic transfer.\n");
         System.out.println("         In economic terms, the funds held in a transaction account are regarded as liquid funds.\n");
         System.out.print("         Transaction accounts are generally used for the business or personal convenience of the account holder.\n");
         System.out.println("         They normally do not earn any or a high interest and the financial institution that maintains the account");
         System.out.println("         commonly charges account maintenance or transaction fees to the account holder.");
         Thread.sleep(2000);
    }
    static void Savings_Account()throws Exception
    {    
         ProjectHeader.headerLineForStarting();
         System.out.println("\nWhat is Savings Account?");
         System.out.print("Answer - ");
         System.out.println("Saving accounts (UK: savings accounts) are accounts maintained by retail financial institutions that pay interest but cannot be used directly");
         System.out.println("         as money in the arrow sense of a medium of exchange (for example, by writing a cheque). These accounts let customers set aside a portion of their");
         System.out.println("         liquid assets while earning a monetary return. For the bank, money in a savings account may not be callable immediately and, in some jurisdictions, ");
         System.out.print("         does not incur a reserve requirement.");
         Thread.sleep(1000);
         System.out.println("Cash in the bank's vaults may thus be used, for example, to fund interest-paying loans.\n");
         System.out.println("         The other major types of deposit account are the transactional account (usually known as a checking (US) or current (UK) account), money market account and time deposit.");
         Thread.sleep(1000);
    }
}