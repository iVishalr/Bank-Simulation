import java.io.*;    
class Accounta
{  
    static String firstName; 
    static String lastName;
    static int Date; 
    static int Month;
    static int Year;
    static int age;
    static String Add;
    static String City;
    static String State;
    static String Country;
    static int Pincode;
    static String a_type;
    static String ID;  
    static String ph;
    static void Account_creation()throws Exception
    {  
        System.out.print("\u000c");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Rules.rules();
        ProjectHeader.headerLineForStarting();
        System.out.println("\n\t\t\tACCOUNT CREATION DETAILS");
        System.out.println("\t\t\t------------------------\n");
        Thread.sleep(500);
        System.out.print("\nPlease enter the following details ");
        System.out.println("in order to create your account\n");
        Thread.sleep(500);
        System.out.print("FIRST NAME :");        
        First_Name_Checker();
        System.out.print("\nLAST NAME  :");
        Last_Name_Checker();
        System.out.print("\nEmail ID (eg=somename@gmail.com) : ");
        email();
        System.out.println();
        System.out.print("BORN ON - DATE  :");
        Date_Checker();
        System.out.print("\t  MONTH :");
        Month_Checker();
        System.out.print("\t  YEAR  :");
        Year_Checker();
        System.out.println();
        age=Bank.currentYear-Year;
        System.out.print("ADDRESS ( HOUSE NUMBER,LOCALITY )  : ");
        addCheck();
        System.out.println();
        System.out.print("CITY :");
        City_Checker();
        System.out.println();
        System.out.print("STATE :");
        State_Checker();
        System.out.println();
        System.out.print("COUNTRY :");
        Country_Checker();
        System.out.println();
        System.out.print("PINCODE :");
        Pincode_Checker();
        System.out.print("\nPHONE NUMBER : ");
        phnoCheck();
        System.out.print("\n\nNOTE :Password will be created ");
        System.out.println("by the computer and will be provided");
        System.out.println("     to you after creating your account");
        System.out.println("\nPlease press Enter to continue");
        br.read();
        Account_Type.type();
    }
    public static void First_Name_Checker()throws Exception
    {
        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(b);
        int flag=0;
        do
        {
            flag=0;
            try
            {
                firstName=br.readLine();
                firstName=firstName.trim();
                String count=firstName;
                int l=count.length();
                for(int i=0;i<l;i++)
                {
                    char ch=count.charAt(i);
                    if(ch>='0' && ch<='9')
                    {
                        throw new Exception();
                    }
                    switch(ch)
                    {
                        case '.':throw new Exception();
                        case '\\':throw new Exception();
                        case '/':throw new Exception();
                        case '?':throw new Exception();
                        case '>':throw new Exception();
                        case ',':throw new Exception();
                        case '<':throw new Exception();
                        case ':':throw new Exception();
                        case '"':throw new Exception();
                        case '!':throw new Exception();
                        case '@':throw new Exception();
                        case '#':throw new Exception();
                        case '$':throw new Exception();
                        case '%':throw new Exception();
                        case 'ˆ':throw new Exception();
                        case '&':throw new Exception();
                        case '*':throw new Exception();
                        case '(':throw new Exception();
                        case ')':throw new Exception();
                        case '-':throw new Exception();
                        case '_':throw new Exception();
                        case '+':throw new Exception();
                        case '=':throw new Exception();
                        case '`':throw new Exception();
                        case '~':throw new Exception();
                        case ' ':throw new Exception();
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("Invalid First Name.");
                System.out.println("Please re-enter it.");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
    }
    public static void Last_Name_Checker()throws Exception
    {
        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(b);
        int flag=0;
        do
        {
            flag=0;
            try
            {
                lastName=br.readLine();
                lastName=lastName.trim();
                String count=lastName;
                int l=count.length();
                for(int i=0;i<l;i++)
                {
                    char ch=count.charAt(i);
                    if(ch>='0' && ch<='9')
                    {
                        throw new Exception();
                    }
                    switch(ch)
                    {
                        case '.':throw new Exception();
                        case '\\':throw new Exception();
                        case '/':throw new Exception();
                        case '?':throw new Exception();
                        case '>':throw new Exception();
                        case ',':throw new Exception();
                        case '<':throw new Exception();
                        case ':':throw new Exception();
                        case '"':throw new Exception();
                        case '!':throw new Exception();
                        case '@':throw new Exception();
                        case '#':throw new Exception();
                        case '$':throw new Exception();
                        case '%':throw new Exception();
                        case 'ˆ':throw new Exception();
                        case '&':throw new Exception();
                        case '*':throw new Exception();
                        case '(':throw new Exception();
                        case ')':throw new Exception();
                        case '-':throw new Exception();
                        case '_':throw new Exception();
                        case '+':throw new Exception();
                        case '=':throw new Exception();
                        case '`':throw new Exception();
                        case '~':throw new Exception();
                        case ' ':throw new Exception();
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("Invalid Last Name.");
                System.out.println("Please re-enter it.");
                Thread.sleep(1000);
                flag=1;
            }
        }
        while(flag==1);
    }
    static void addCheck()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            flag=0;
            try
            {
                Add=br.readLine();
                if(Add.length()<=70)
                {
                }
                else 
                    throw new Exception();
            }
            catch(Exception e)
            {
                System.out.print("Your Address is greater than ");
                System.out.println("70 characters. Please enter again.");
                flag=1;
                Thread.sleep(1500);
            }
        }
        while(flag==1);
    }
    static void phnoCheck()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            flag=0;
            try
            {
                ph=br.readLine();
                String count = ph;
                int c=0;
                for(int i=0;i<count.length();i++)
                {
                    char ch=count.charAt(i);
                    c++;
                }
                if(c!=10)
                       throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Phone number is invalid.");
                System.out.println("Please re-enter it.");
                flag=1;
                Thread.sleep(1200);
            }
        }
        while(flag==1);
    }
    public static void email()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int b=0;
        String g1="@gmail.in";         String g2="@gmail.com";
        String y1="@yahoo.in";         String y2="@yahoo.com";
        String h1="@hotmail.in";       String h2="@hotmail.com";
        String r1="@rediff.in";        String r2="@rediff.com";
        int flag=0;
        do
        {
           flag=0;
           try
           {
               ID=br.readLine();
               String s=ID;
               String s1=s;
               for(int i=0;i<s1.length();i++)
               {
                   char ch=s1.charAt(i);
                   if(Character.isWhitespace(ch))
                   { 
                       throw new Exception();
                   }
                   if(Character.isUpperCase(ch)==true)
                   {
                       throw new Exception();
                   }
               }
               if(s.startsWith("@"))    
                            throw new Exception();
               else
               {
                    if(s.endsWith(g1))
                            break;
                    else if(s.endsWith(g2))
                            break;
                    else if(s.endsWith(y1))
                            break;
                    else if(s.endsWith(y2))
                            break;
                    else if(s.endsWith(h1))
                            break;  
                    else if(s.endsWith(h2))
                            break;
                    else if(s.endsWith(r1))
                            break;
                    else if(s.endsWith(r2))
                            break;
                    else
                            throw new Exception();
               }
           }
           catch(Exception e)
           {
               System.out.println();  
               System.out.print("The Email-ID that you ");
               System.out.println("have entered above is invalid.");
               System.out.println("Please enter your correct Email-ID.");
               flag=1;
           }
        }
        while(flag==1);
    }
    public static void Date_Checker()throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int flag=0;
       do
       {
           try
           {
               flag=0; 
               Date=Integer.parseInt(br.readLine());
               if(Date<1 || Date>31)
                    throw new Exception();
           }
           catch(Exception e)
           {
               System.out.println("\nDate is incorrect.");
               System.out.println("Please re-enter it.");
               flag=1;
           }
       }
       while(flag==1);
    }
    public static void Month_Checker()throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int flag=0;int d=0,count1=0;
         do
       {
           try
           {
               flag=0; 
               if(d==1)
               {
                   if(count1==2)
                    {
                        System.out.print("February Month ");
                        System.out.println("can only have 28 days");
                        System.out.print("If the year is a leap year");
                        System.out.println(",it will have 29 days");
                    }
                   Date_Checker();
                   System.out.println("Please re-enter Month");
               }
               Month=Integer.parseInt(br.readLine());
               if(Month<1 || Month>12)
                    throw new Exception();
               if(Date>29 && Month==2)
               {
                   d=1;
                   throw new NumberFormatException();
               }
               else 
                   d=0;
           }
           catch(Exception e)
           {
               if(d==0)
               {
                    System.out.println("\nMonth is incorrect.");
                    System.out.println("Please re-enter it.");
                    flag=1;
               }
               else if(d==1)
               {
                    System.out.println("\nDate is incorrect.");
                    System.out.println("Please re-enter it.");
                    flag=1;
                    count1++;
                    d=1;
               }
           }
       }
       while(flag==1); 
    }
    public static void Year_Checker()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;int yrs=0;int d=0,count1=0;
        do
        {
            try
            {
                flag=0;
                if(d==1)
                {
                    if(count1==2)
                    {
                        System.out.print("February Month ");
                        System.out.println("can only have 28 days");
                        System.out.print("If the year is a leap year");
                        System.out.println(",it will have 29 days");
                    }
                    Date_Checker();
                    System.out.println("Please re-enter the year");
                }
                String s=br.readLine();
                int count=s.length();
                Year=Integer.parseInt(s);
                yrs=Year;
                if(count==4)
                {
                    if(yrs%4==0)
                    {
                        if(Date<=29 && Month==2)
                        {
                            d=0;
                        }
                        else if(Date<=28 && Month==2)
                            d=0;
                        else if(Date>=1 && Date<=31 && Month!=2)
                            d=0;
                        else 
                        {
                            d=1;
                            throw new Exception();
                        }
                    }
                    else
                    {
                        if(Date>28 && Month==2)
                        {
                            d=1;
                            throw new Exception();
                        }
                        else if(Date<=28 && Month==2)
                            d=0;
                        else if(Date>=1 && Date<=31 && Month!=2)
                            d=0;
                    }
                    if(Year<1916)
                        throw new Exception();
                    else if(Year<=Bank.currentYear)
                    {
                        if((Year+10)>Bank.currentYear)
                        {
                            System.out.print("Sorry , you must be atleast 10 ");
                            System.out.print("years to create an account in ");
                            System.out.println("our bank.\nPlease enter again.");
                            flag=1;
                        }
                    }
                    else if(Year>Bank.currentYear)
                        throw new Exception();
                }
                else
                    throw new Exception();
            }
            catch(Exception e)
            {
                if(d==0)
                {
                    System.out.print("\nSorry ,the year entered ");
                    System.out.println("is incorrect.");
                    System.out.println("Please re-enter it.");
                    flag=1;
                }
                else if(d==1)
                {
                    System.out.println("\nDate is incorrect.");
                    System.out.println("Please re-enter it.");
                    flag=1;
                    count1++;
                    d=1;
                } 
            }
        }
        while(flag==1);
    }
    public static void City_Checker()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            try
            {
                flag=0; 
                City=br.readLine();
                if(City.length()<3)
                 throw new Exception();
            }
            catch(Exception e)
            {
                System.out.print("\nInvalid entry.");
                System.out.print("Please type again\n");
                flag=1;
            } 
        }
        while(flag==1);
    }
    public static void State_Checker()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            try
            {
                flag=0; 
                State=br.readLine();
                if(State.length()<3)
                 throw new Exception();
            }
            catch(Exception e)
            {
                System.out.print("\nInvalid entry.Please type again\n");
                flag=1;
            }
        }
        while(flag==1);
    }
    static void Country_Checker()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            try
            {
                flag=0; 
                Country=br.readLine();
                if(Country.length()<3)
                 throw new Exception();
            }
            catch(Exception e)
            {
                System.out.print("\nInvalid entry.Please type again\n");
                flag=1;
            }
        }
        while(flag==1);
    }
    static void Pincode_Checker()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            try
            {
                flag=0; 
                Pincode=Integer.parseInt(br.readLine());
                int p=Pincode;
                int c=0;
                while(p>0)
                {
                    p=p/10;
                    c++;
                }
                if(c!=6)
                      throw new Exception();
            } 
            catch(Exception e)
            {
                System.out.print("\nInvalid entry.");
                System.out.print("Please type again\n");
                flag=1;
            }
        }
        while(flag==1);
    }
    public static String Account_Number()throws Exception
    {
        double p=Math.random()*(100-10)+10;
        int a=(int)Bank.Account;
        String s=a+""+(int)p;
        return s;
    }
}