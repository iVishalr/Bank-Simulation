import java.io.*;
class Loan
{   
    String t_loan;
    long ac;
    double mon;
    int time;
    double r;
    float p;
    static int takenLoan=0;
    void a()throws Exception
    {  
        loan();
    }
    int Interest(double P,double R,int T)throws Exception
    {
        double C;
        if(t_loan.equalsIgnoreCase("Car"))
        { 
           double t=(double)T;
           C=(P*Math.pow((1+(R/100)),T/12))-P;
        }
        else
        {
          C=(P*Math.pow((1+(R/100)),T))-P;
        }  
        return (int)C;
    }
    double h_i(double m)
    {
        r=9;
        return r;
    }
    float h_i(float m)
    {
        if(m<=400000)
        {
            r=7;
        }
        else if(m>400000 && m<=750000)
        {
            r=8;
        }
        else if(m>750000)
        {
            r=6;
        }
        return (float)r;
    }
    void loan()throws Exception
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");int flag=0;
        if(Accounta.a_type.equals("S"))
        {
            fileReading.getSLoanBalance(Bank.pan);
        }
        else if(Accounta.a_type.equals("C"))
        {
            fileReading.getCLoanBalance(Bank.pan);
        }
        if(takenLoan==1)
        {
            ProjectHeader.headerLine();
            System.out.println("Please repay your old loan inorder to take a new loan");
            System.out.println("Press :");
            System.out.println("1. To repay old loan\n2. To go to Bank Menu");
            do
            {
                flag=0;
                try
                {
                    byte choice=Byte.parseByte(br.readLine());
                    if(choice==1)
                        loanRePayment();
                    else if(choice==2)
                        Bank_Menu.display_Menu();
                    else
                        throw new NumberFormatException();
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Enter a valid menu choice");
                    flag=1;
                    Thread.sleep(2000);
                }
            }
            while(flag==1);
            loan();
        }
        if(takenLoan==0)
        {
            flag=0;
            do
            {
                flag=0;
                try
                {
                    if(Accounta.age>=18)
                    {
                        ProjectHeader.headerLine();
                        System.out.println("What type of loan do you require?");
                        System.out.println("1 Home Loan");
                        System.out.println("2 Car Loan");
                        System.out.println("3 Gold Loan\n4 Education Loan");
                        System.out.println("5 Bank Menu");
                    }
                    else
                    {
                        ProjectHeader.headerLine();
                        System.out.println("Since your age is below 18 years, you can take only Education Loan.");
                        System.out.println("Press :\n1 To Continue\n2 Bank Menu");
                        do
                        {
                            flag=0;
                            try
                            {
                                int choice = Integer.parseInt(br.readLine());
                                if(choice==1)
                                    educationLoan();
                                else if(choice==2)
                                    Bank_Menu.display_Menu();
                                else
                                    throw new NumberFormatException();
                            }
                            catch(NumberFormatException e)
                            {
                                System.out.println("Please enter a valid menu choice");
                                flag=1;
                                Thread.sleep(1200);
                            }
                        }
                        while(flag==1);
                    }
                    if(Accounta.age>=18)
                    {
                        int a = 0 ;
                        String inp = br.readLine();
                        if(!"".equals(inp))
                        {
                            a = Integer.parseInt(inp);
                        }
                        else
                        {    
                            throw new Exception();
                        }
                        if(a==1 && Accounta.age>=18)
                        {
                            homeLoan();
                        }
                        else if(a==2 && Accounta.age>=18)
                        {
                            carLoan();
                        }
                        else if(a==3 && Accounta.age>=18)
                        {
                            goldLoan();
                        }
                        else if(a==4 && Accounta.age>=18)
                        {
                            educationLoan();
                        }
                        else if(a==5 && Accounta.age>=18)
                        {
                            Bank_Menu.display_Menu();
                        }
                        else 
                        {
                            throw new Exception();
                        }
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Invalid menu entered , please enter a valid menu");    
                    Thread.sleep(1000);
                    flag=1;
                    System.out.print("\u000c");
                }
            }
            while(flag==1);
        }
    }
    void  homeLoan()throws Exception
    {   t_loan="home";
        takenLoan=1;
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="WELCOME TO HOME LOAN DEPARTMENT";
        int len=s.length();
        int k=0;
        System.out.print("\n\t\t\t\t\t\t\t               ");
        while(k<len)
        {
            char ch=s.charAt(k);
            for(int j=0;j<1;j++)
            {
                System.out.print(ch);
                Thread.sleep(150);
            }
            k++;
        }
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        HomeLoanDepartment();
        System.out.println("\nHow much money do you require?");
        System.out.println("Minimum Rs. 3,00,000 ; Maximum Rs. 40,00,000");
        int flag=0;
        do
        {
            flag=0;
            try
            {
                mon=Double.parseDouble(br.readLine());
                if(mon==0)
                {
                    throw new Exception();
                }
                if(mon>=300000 && mon<=4000000)
                {
                }
                else
                    throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("\nRequired money is not within the given range(Minimum Rs. 3,00,000 ; Maximum Rs. 40,00,000).\nPlease enter again.\n");
                Thread.sleep(2000);
                flag=1;
            }
        }
        while(flag==1);
        System.out.println("\nHow many years do you require to repay the loan?\nMaximum 8 years");
        flag=0;
        do
        {
            flag=0;
            try
            {
                time=Integer.parseInt(br.readLine());
                if(time>8 || time==0)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired time is invalid!\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("C"))
        {
           double balance=fileReading.getCBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getCBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           HomeLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1. To go to loan menu\n2. To go to Bank Menu");
           fileWriting.CLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        else if(Accounta.a_type.equals("S"))
        {
           double balance=fileReading.getSBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getSBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           HomeLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1. To go to loan menu\n2. To go to Bank Menu");
           fileWriting.SLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        do
        {
            flag=0;
            int i=Integer.parseInt(br.readLine());
            try
            {
                if(i==1)
                {   
                    loan();
                }
                else if(i==2)
                {
                    Bank_Menu.display_Menu();
                }
                else 
                    throw new NumberFormatException();
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid menu choice");
                Thread.sleep(2000);
                flag=1;
            }
        }
        while(flag==1);
    }
    void HomeLoanDepartment()throws Exception
    {
        String s="WELCOME TO HOME LOAN DEPARTMENT";
        System.out.print("\n\t\t\t\t\t\t\t               ");
        System.out.print(s);
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
    }
    void  carLoan()throws Exception
    {   t_loan="car";
        takenLoan=1;
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="WELCOME TO CAR LOAN DEPARTMENT";
        int len=s.length();
        int k=0;
        System.out.print("\n\t\t\t\t\t\t\t                ");
        while(k<len)
        {
            char ch=s.charAt(k);
            for(int j=0;j<1;j++)
            {
                System.out.print(ch);
                Thread.sleep(150);
            }
            k++;
        }
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        CarLoanDepartment();
        System.out.println("\nHow much money do you require?");
        System.out.println("Minimum Rs. 1,00,000 ; Maximum Rs. 15,00,000");
        int flag=0;
        do
        {
            flag=0;
            try
            {
                mon=Double.parseDouble(br.readLine());
                if(mon==0)
                {
                    throw new Exception();
                }
                if(mon<100000 || mon>1500000)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired money is not within the given range(Minimum Rs. 1,00,000 ; Maximum Rs. 15,00,000).\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        System.out.println("\nHow many years do you require to repay the loan?\nMaximum 2 years");
        flag=0;
        do
        {
            flag=0;
            try
            {
                time=Integer.parseInt(br.readLine());
                if(time>2 || time==0)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired time is above Maximum Limit(Maximum 2).\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("C"))
        {
           double balance=fileReading.getCBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getCBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           CarLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1. To go to loan menu\n2. To go to Bank Menu");
           fileWriting.CLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        else if(Accounta.a_type.equals("S"))
        {
           double balance=fileReading.getSBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getSBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           CarLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1. To go to loan menu\n2. To go to Bank Menu");
           fileWriting.SLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        do
        {
            flag=0;
            int i=Integer.parseInt(br.readLine());
            try
            {
                if(i==1)
                {   
                    loan();
                }
                else if(i==2)
                {
                    Bank_Menu.display_Menu();
                }
                else 
                    throw new NumberFormatException();
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid menu choice");
                Thread.sleep(2000);
                flag=1;
            }
        }
        while(flag==1);
    }
    void CarLoanDepartment()throws Exception
    {
        String s="WELCOME TO CAR LOAN DEPARTMENT";
        System.out.print("\n\t\t\t\t\t\t\t                ");
        System.out.print(s);
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
    }
    void  educationLoan()throws Exception
    {   t_loan="edu";
        takenLoan=1;
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="WELCOME TO EDUCATION LOAN DEPARTMENT";
        int len=s.length();
        int k=0;
        System.out.print("\n\t\t\t\t\t\t\t             ");
        while(k<len)
        {
            char ch=s.charAt(k);
            for(int j=0;j<1;j++)
            {
                System.out.print(ch);
                Thread.sleep(150);
            }
            k++;
        }
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<180);
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        EducationLoanDepartment();
        System.out.println("\nHow much money do you require?");
        System.out.println("Maximum Rs. 10,00,000");
        int flag=0;
        do
        {
            flag=0;
            try
            {
                mon=Double.parseDouble(br.readLine());
                if(mon==0)
                {
                    throw new Exception();
                }
                if(mon>1000000)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired money is not within the given range(Maximum Rs10,00,000).\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        System.out.println("\nHow many years do you require to repay the loan?\nMaximum 2 years");
        flag=0;
        do
        {
            flag=0;
            try
            {
                time=Integer.parseInt(br.readLine());
                if(time>2 || time==0)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired time is above Maximum Limit(Maximum 2).\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("C"))
        {
           double balance=fileReading.getCBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getCBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           EducationLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1. To go to loan menu\n2. To go to Bank Menu");
           fileWriting.CLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        else if(Accounta.a_type.equals("S"))
        {
           double balance=fileReading.getSBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getSBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           EducationLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1. To go to loan menu\n2. To go to Bank Menu");
           fileWriting.SLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        do
        {
            flag=0;
            int i=Integer.parseInt(br.readLine());
            try
            {
                if(i==1)
                {   
                    loan();
                }
                else if(i==2)
                {
                    Bank_Menu.display_Menu();
                }
                else 
                    throw new NumberFormatException();
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid menu choice");
                Thread.sleep(2000);
                flag=1;
            }
        }
        while(flag==1);
    }
    void EducationLoanDepartment()throws Exception
    {
        String s="WELCOME TO EDUCATION LOAN DEPARTMENT";
        System.out.print("\n\t\t\t\t\t\t\t             ");
        System.out.print(s);
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
    }
    void  goldLoan()throws Exception
    {  
        t_loan="gold";
        takenLoan=1;
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="WELCOME TO GOLD LOAN DEPARTMENT";
        int len=s.length();
        int k=0;
        System.out.print("\n\t\t\t\t\t\t\t                ");
        while(k<len)
        {
            char ch=s.charAt(k);
            for(int j=0;j<1;j++)
            {
                System.out.print(ch);
                Thread.sleep(150);
            }
            k++;
        }
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
        System.out.print("\u000c");
        ProjectHeader.headerLine();
        GoldLoanDepartment();
        System.out.println("\nHow much money do you require?");
        System.out.println("Minimum Rs. 25,000 ; Maximum Rs. 20,00,000");
        int flag=0;
        do
        {
            flag=0;
            try
            {
                mon=Double.parseDouble(br.readLine());
                if(mon==0)
                {
                    throw new Exception();
                }
                if(mon<25000 || mon>2000000)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired money is not within the given range(Minimum Rs25,000 ; Maximum Rs 20,00,000).\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        System.out.println("\nHow many years do you require to repay the loan?\nMaximum 3 years");
        flag=0;
        do
        {
            flag=0;
            try
            {
                time=Integer.parseInt(br.readLine());
                if(time>3 || time==0)
                {
                    flag=1;throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nRequired time is above Maximum Limit(Maximum 3).\nPlease enter again.\n");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("C"))
        {
           double balance=fileReading.getCBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getCBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           GoldLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1 To go to loan menu\n2 To go to Bank Menu");
           fileWriting.CLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        else if(Accounta.a_type.equals("S"))
        {
           double balance=fileReading.getSBalance(Bank.pan);
           balance=balance+Double.parseDouble(String.valueOf(mon));
           fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
           double updatedBalance=fileReading.getSBalance(Bank.pan);
           Thread.sleep(2000);
           am();
           r=h_i(mon);
           int i=Interest(mon,r,time);
           System.out.print("\u000c");
           ProjectHeader.headerLine();
           GoldLoanDepartment();
           System.out.println("\nYour Account is credited with Rs. "+mon+"\n\n\nCurrent account balance- Rs"+updatedBalance);
           System.out.println("You should be paying Rs. "+(mon+i)+" in "+time+" years at the rate of interest "+r+"%");
           System.out.println("Press \n1 To go to loan menu\n2 To go to Bank Menu");
           fileWriting.SLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf((mon+i)));
        }
        do
        {
            flag=0;
            int i=Integer.parseInt(br.readLine());
            try
            {
                if(i==1)
                {   
                    loan();
                }
                else if(i==2)
                {
                    Bank_Menu.display_Menu();
                }
                else 
                    throw new NumberFormatException();
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid menu choice");
                Thread.sleep(2000);
                flag=1;
            }
        }
        while(flag==1);
    }
    void GoldLoanDepartment()throws Exception
    {
        String s="WELCOME TO GOLD LOAN DEPARTMENT";
        System.out.print("\n\t\t\t\t\t\t\t             ");
        System.out.print(s);
        int m=1;
        System.out.println();
        do
        {
            System.out.print("_");
            m++;
        }
        while(m<=180);
    }
    void am()throws Exception
    {
        String s=Accounta.a_type;
        if(s.equalsIgnoreCase("C"))
        {
            r=r++;
        }
    }
    void loanRePayment()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double balance=0;
        double accBalance=0;
        double balance2=0;
        double sum=0;
        int flag=0;
        if(Accounta.a_type.equals("S"))
        {
            balance2=fileReading.getSLoanBalance(Bank.pan);
            accBalance=fileReading.getSBalance(Bank.pan);
        }
        else if(Accounta.a_type.equals("C"))
        { 
            balance2=fileReading.getCLoanBalance(Bank.pan);
            accBalance=fileReading.getCBalance(Bank.pan);
        }
        do
        {
            flag=0;
            try
            {
                System.out.print("\u000c");
                ProjectHeader.headerLine();
                System.out.println("\nLOAN REPAYMENT\n\nRemaining Loan Balance is Rs"+balance2);
                System.out.println("\nPlease enter the amount that you want to payback.");
                sum=Double.parseDouble(br.readLine());
                if(sum>accBalance)
                {
                    System.out.print("Your Account Balance is less than the amount of money you want to pay.");
                    System.out.println("Please deposit some amount of money");
                    System.out.println("Press \n1. To re-enter payment amount\n2. To Deposit some money");
                    do
                    {
                        flag=0;
                        try
                        {
                            int i=Integer.parseInt(br.readLine());
                            if(i==1)
                            {
                                Thread.sleep(1000);
                                lrp();
                            }
                            else if(i==2)
                            {
                                Thread.sleep(1000);
                                Money.userDeposit();
                                lrp();
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
                if(sum>balance2)
                {     
                    System.out.println("Amount entered exceeds the loan amount. Please enter a valid amount.");
                    flag=1;
                }
                else if(sum<1)
                     throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Amount entered is invalid. Please enter a valid amount.");
                flag=1;
                Thread.sleep(1000);
            }
        }
        while(flag==1);
        if(Accounta.a_type.equals("S"))
        {
            balance=fileReading.getSBalance(Bank.pan);
        }
        else if(Accounta.a_type.equals("C"))
        {
            balance=fileReading.getCBalance(Bank.pan);
        }
        System.out.println("\nYour Initial Account Balance is Rs"+balance);
        balance=balance-sum;
        System.out.println("\nYour Current Account Balance is Rs"+balance);
        if(Accounta.a_type.equals("S"))
        {
            fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
        }
        else if(Accounta.a_type.equals("C"))
        {
            fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
        }
        balance2=balance2-sum;
        if(balance2!=0)
         {
            System.out.println("You must still pay Rs"+balance2);
            if(Accounta.a_type.equals("S"))
            {
                fileWriting.SLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf(balance2));
            }
            else if(Accounta.a_type.equals("C"))
            {
                fileWriting.CLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf(balance2));
            }
            Thread.sleep(7500);
            System.out.print("\u000c");
            loan();
        }
        else 
        {    
            System.out.println("You have Repaid the Loan successfully");
            takenLoan=0;
            if(Accounta.a_type.equals("S"))
            {
                fileWriting.SLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf(balance2));
            }
            else if(Accounta.a_type.equals("C"))
            {
                fileWriting.CLoanAccount(Bank.pan,String.valueOf(takenLoan),String.valueOf(balance2));
            }
            if(TimeSimulator.afterloan==1)
                TimeSimulator.afterloan=0;
            Thread.sleep(7500);
            System.out.print("\u000c");
            if(TimeSimulator.afterloan==0)
                Bank_Menu.display_Menu();
            else
                loan();
        }
    }
    void lrp()throws Exception
    {
        loanRePayment();
    }
}       