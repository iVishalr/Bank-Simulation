import java.io.*;
class Rules
{
    static int notAgreed=0;
    static void rules()throws Exception
    {
        ProjectHeader.headerLineForStarting();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PLEASE DON'T TYPE ANYTHING WHEN YOU ARE ASKED TO READ SOMETHING.");
        System.out.println("WHEN A MENU APPEARS TYPE ONLY THE NUMBER NOT THE NUMBER IN WORDS eg:1  NOT:One or 1 One...");
        System.out.println("PLEASE NOTE DOWN THINGS WHICH YOU ARE ASKED TO DO");
        System.out.println("IF NOT DONE YOU WILL FACE A PROBLEM!");
        System.out.println("THERE ARE CERTAIN PLACES WHERE YOU NEED TO PRESS ENTER TO CONTINUE IF NOT NO OR N TO STOP. PLEASE FOLLOW THE INSTRUCTIONS");
        System.out.println("DISPLAYED THERE.\n");
        System.out.println("Please read the following rules in order to use our services efficiently\nBANK TIMINGS 9 AM TO 9 PM IST");
        System.out.println("1.Creating Account");
        System.out.print("  ");
        for(int i=1;i<=16;i++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("\nFirst Name: Enter your NAME. Your Name should not contain any Special characters such as / % ˆ & * ( ) $ # @ !");
        System.out.println("             Your Name should not contain any whitespaces\n");
        System.out.println("Last Name: Same as First Name\n");
        System.out.println("BORN ON DATE : The entered date must be within 31 and greater than 0");
        System.out.println("        MONTH: The entered month( number ) must be within 12 and greater than 0");
        System.out.println("        YEAR : The entered date must be correct in format for example:2001,1996....");
        System.out.println("               Your current age will be decided upon that. If you are less than 18 years,some of our features cannot be accessed");
        System.out.println("               Minimum age limit:11\n");
        System.out.println("Address: Enter your Recidency Address. Maximum limit:70 characters\n");
        System.out.println("City   : Enter your Recidency City eg:Bangalore,Delhi..");
        System.out.println("State  : Enter your Recidency State eg:Karnataka,Hyderabad,Gujrat..");
        System.out.println("Country: Enter your Recidency Country eg:India,USA,Cannada..\n");
        System.out.println("Pincode: Enter your Recidency Pincode eg:560085,560001....\n"); 
        System.out.println();
        System.out.println("Press enter to continue");
        br.read();
        System.out.print("\u000c");
    }
    static void forNext()throws Exception
    {
        ProjectHeader.headerLineForStarting();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("2.Depositing and withdrawing Money");
        System.out.print("  ");
        for(int i=1;i<=32;i++)
        {
            System.out.print("-");
        }
        System.out.println("\nWhile depositing some amount, don't specify the sum greater than Rs 10,00,000 for your convenience");
        System.out.println("While withdrawing the same conditions apply");
        System.out.print("Press ENTER Key to View Next  --->");
        br.read();
        System.out.println("\u000c");
        ProjectHeader.headerLineForStarting();
        System.out.println("\n3.Loan");
        System.out.print("  ");
        for(int i=1;i<=4;i++)
        {
            System.out.print("-");
        }
        System.out.println("\nThere are many types of loans available in our bank.");
        System.out.println("In each type of loan, there are many instructions that are displayed there itself.");
        System.out.println("Please follow them.");
        Thread.sleep(7000);
        next();
    }
    static void next()throws Exception
    {
        System.out.println("\u000c");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag=0;
        do
        {
            flag=0;
            try
            {
                ProjectHeader.headerLineForStarting();
                System.out.println("\n");
                DesignCreator.IBBSecurityGenerator();
                DesignCreator.IBBSecurityGenerator2();
                System.out.print("\nPlease type all the letters, as it is in a single line, that are present in each line of the Code without any spaces\nYour Code : ");
                String ibb="IBBBBIBBBBI";
                String Ibb=br.readLine();
                System.out.println("Please Type the following as it is if you want to proceed further! If not type BACK\n");
                System.out.println("I ACKNOWLEDGE THAT I HAVE READ AND I AGREE TO THE ABOVE TERMS AND CONDITIONS AND FOLLOW IT IN THE DUE COURSE\n");
                String agreement="I ACKNOWLEDGE THAT I HAVE READ AND I AGREE TO THE ABOVE TERMS AND CONDITIONS AND FOLLOW IT IN THE DUE COURSE";
                String s=br.readLine();
                if(s.equals(agreement) && Ibb.equals(ibb))
                {
                    notAgreed=0;
                    String csv=fileReading.readCsv(Bank.pan);
                    csv=csv+String.valueOf(notAgreed);
                    fileWriting.WriteCred2(Bank.pan,csv);
                    fileReading.readCsv2(Bank.pan,0);
                }
                else if(s.equalsIgnoreCase("BACK") && Ibb.equals(ibb))
                {
                    notAgreed=1;
                    String csv=fileReading.readCsv(Bank.pan);
                    csv=csv+String.valueOf(notAgreed);
                    fileWriting.WriteCred2(Bank.pan,csv);
                }
                else if(!s.equalsIgnoreCase("Back") || !s.equals(agreement) && !Ibb.equals(ibb))
                {
                    throw new Exception();
                }
            }
            catch(Exception e)
            {
                System.out.println("\nYour Code or Acknowledgement of the rules does not match. Please enter again.");
                Thread.sleep(2200);
                System.out.print("\u000c");
                flag=1;
            }
        }
        while(flag==1);
    }
}