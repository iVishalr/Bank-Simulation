import java.io.*;
class Bank_Menu
{
    static double onBegin=0;
    static void display_Menu()throws Exception
    {   
        if(Rules.notAgreed==1)
        {
            System.out.print("\u000c");
            ProjectHeader.headerLine();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n\t\t\tSORRY YOU CAN'T PROCEED FURTHER UNLESS YOU ACCEPT THE TERMS AND CONDITIONS OF OUR BANK");
            System.out.println("\n\t\t\tDo you want to read again and accept the conditions. If yes press Enter key else press NO.");
            System.out.println("\t\t\tIf you press NO we will be deleting your account permanently");
            String s=br.readLine();
            if(s.equals(""))
            {
                Rules.next();
            }
            else if(s.equalsIgnoreCase("NO"))
            {
                int flag=0;
                double balance=0;
                do
               {
                   flag=0;
                   try
                   {
                       if(Accounta.a_type.equals("C"))
                       {
                           balance=fileReading.getCBalance(Bank.pan);
                           fileWriting.WrittenCredRemover(Bank.pan,"");
                           fileWriting.CAccountDeleter(Bank.pan,String.valueOf(balance));
                           Rules.notAgreed=0;
                           BeginApplication.l();
                        } 
                        else if(Accounta.a_type.equals("S"))
                        {
                            balance=fileReading.getSBalance(Bank.pan);
                            fileWriting.WrittenCredRemover(Bank.pan,"");
                            fileWriting.SAccountDeleter(Bank.pan,String.valueOf(balance));
                            Rules.notAgreed=0;
                            BeginApplication.l();
                        }
                        else
                        {
                            throw new NumberFormatException();
                        }
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Enter correct menu choice");
                        flag=1;
                    }
                }
                while(flag==1);
            }
        }
        if(Rules.notAgreed==0)
                display();
    }
    static void display()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            try
            {
                System.out.print("\u000c");
                ProjectHeader.headerLine();
                String s1=fileReading.readFirstName(Bank.pan);
                System.out.println("\n   WELCOME "+s1);
                System.out.println("\nBANK MENU");
                for(int i=1;i<10;i++)
                        System.out.print("-");
                System.out.println();
                flag=0;
                System.out.println(" 1 . Transact Money");
                System.out.println(" 2 . Foreign Exchange");
                System.out.println(" 3 . Loan");
                if(Accounta.age<18)
                {
                    System.out.println(" 4 . Simulate time");
                    System.out.println(" 5 . Logout");
                    System.out.println(" 6 . Close Account");
                    System.out.println(" 7 . Quit");
                }
                else
                {   
                    System.out.println(" 4 . Atm");
                    System.out.println(" 5 . Cheque");
                    System.out.println(" 6 . Simulate time");
                    System.out.println(" 7 . Logout");
                    System.out.println(" 8 . Close Account");
                    System.out.println(" 9 . Quit");
                }
                System.out.print(" ");
                int a =Integer.parseInt(br.readLine()); 
                if(a>9 || a<1)
                     throw new Exception();
                if(Accounta.age>=18)
                {
                    if(a==1)
                    {  
                        ProjectHeader.loading();
                        Money.a_Menu();
                    }
                    else if(a==2)
                    {
                        ProjectHeader.loading();
                        F_Exchange.exchange();
                    }
                    else if(a==3)
                    {
                        ProjectHeader.loading();
                        Loan l = new Loan();
                        l.loan();
                    }
                    else if(a==4)
                    {
                        ProjectHeader.loading();
                        Atm.Atm();
                    }
                    else if(a==5)
                    {
                        ProjectHeader.loading();
                        Cheque.acc();
                    }
                    else if(a==6)
                    {
                        ProjectHeader.loading();
                        TimeSimulator.timesim();
                    }
                    else if(a==7 && Accounta.age>=18)
                    {
                        System.out.println("Are you sure? \nIf yes press Y or else N");
                        int flag1=0;
                        do
                        {
                            flag1=0;
                            try
                            {
                                String b=br.readLine();
                                String p="Y";
                                String l="N";
                                if(Accounta.a_type.equals("C"))
                                    onBegin=fileReading.getCBalance(Bank.pan);
                                else if(Accounta.a_type.equals("S"))
                                    onBegin=fileReading.getSBalance(Bank.pan);
                                if(b.equalsIgnoreCase(p))
                                {
                                        ProjectHeader.loading();
                                        BeginApplication.l();
                                }
                                else if(b.equalsIgnoreCase(l))
                                {
                                        display();
                                }
                                else
                                {
                                    throw new Exception();
                                }
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please enter a valid menu choice");
                                flag1=1;
                                Thread.sleep(1000);
                            }
                        }
                        while(flag1==1);
                    }
                    else if(a==8)
                    {
                        ProjectHeader.loading();
                        delete_Account();
                    }
                    else if(a==9)
                        EndApplication.end();
                }
                else if(Accounta.age<18)
                {
                    if(a==1)
                    {  
                        ProjectHeader.loading();
                        Money.a_Menu();
                    }
                    else if(a==2)
                    {
                        ProjectHeader.loading();
                        F_Exchange.exchange();
                    }
                    else if(a==3)
                    {
                        ProjectHeader.loading();
                        Loan l = new Loan();
                        l.loan();
                    }
                    else if(a==4)
                    {
                        ProjectHeader.loading();
                        TimeSimulator.timesim();
                    }
                    else if(a==5)
                    {
                        System.out.println("Are you sure? \nIf yes press Y or else N");
                        int flag1=0;
                        do
                        {
                            flag1=0;
                            try
                            {
                                
                                String b=br.readLine();
                                String p="Y";
                                String l="N";
                                if(Accounta.a_type.equals("C"))
                                    onBegin=fileReading.getCBalance(Bank.pan);
                                else if(Accounta.a_type.equals("S"))
                                    onBegin=fileReading.getSBalance(Bank.pan);
                                if(b.equalsIgnoreCase(p))
                                {
                                        ProjectHeader.loading();
                                        BeginApplication.l();
                                }
                                else if(b.equalsIgnoreCase(l))
                                {
                                        display();
                                }
                                else
                                {
                                    throw new Exception();
                                }
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please enter a valid menu choice");
                                flag1=1;
                                Thread.sleep(1000);
                            }
                        }
                        while(flag1==1);
                    }
                    else if(a==6)
                    {
                        ProjectHeader.loading();
                        delete_Account();
                    }
                    else if(a==7)
                        EndApplication.end();
                }
            }
            catch(Exception e)
            {
                System.out.println("Invalid menu entered , please enter a valid menu choice");    
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void delete_Account()throws Exception
    {
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        int flag=0;
        double balance=0;
        do
        {
            flag=0;
            try
            {
                if(Accounta.a_type.equals("C"))
                {
                    balance=fileReading.getCBalance(Bank.pan);
                    fileWriting.WrittenCredRemover(Bank.pan,"");
                    fileWriting.CAccountDeleter(Bank.pan,String.valueOf(balance));
                    fileWriting.CLoanAccountRemover(Bank.pan);
                    BeginApplication.l();
                } 
                else if(Accounta.a_type.equals("S"))
                {
                    balance=fileReading.getSBalance(Bank.pan);
                    fileWriting.WrittenCredRemover(Bank.pan,"");
                    fileWriting.SAccountDeleter(Bank.pan,String.valueOf(balance));
                    fileWriting.SLoanAccountRemover(Bank.pan);
                    BeginApplication.l();
                }
                else
                    throw new NumberFormatException();
            }
            catch(NumberFormatException e)
            {
                 System.out.println("Enter correct menu choice");
                 flag=1;
            }
        }
        while(flag==1);    
    }
}