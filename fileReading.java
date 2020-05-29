import java.io.*;
class fileReading
{
    static String[] readCred(String id)throws Exception
    {
        String k = "";
        String[] credArr = new String[2];
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id +"cred.txt"));
            for(int i=0 ; i<2 ; i++)
            {
              credArr[i] = br.readLine();
            }
            br.close();
        }
        catch(Exception ex)
        {
        }
        return credArr;
    }
    static void readCompleteCred(String id)throws Exception
    {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id + "cred.txt"));
            if(Atm.Control!=0)
            {
                Bank.pan2=br.readLine();
            }
            else
            {
                br.readLine();
                br.readLine();
            }
            Accounta.firstName = br.readLine();
            Accounta.lastName= br.readLine();
            Accounta.ID= br.readLine();
            Accounta.Add= br.readLine();
            Accounta.City= br.readLine();
            Accounta.State= br.readLine();
            Accounta.Country= br.readLine();
            Accounta.Pincode= Integer.parseInt(br.readLine());
            Accounta.Date= Integer.parseInt(br.readLine());
            Accounta.Month= Integer.parseInt(br.readLine());
            Accounta.Year= Integer.parseInt(br.readLine());
            Accounta.age= Integer.parseInt(br.readLine());
            Accounta.a_type=br.readLine();
            Account_Information.Container=Integer.parseInt(br.readLine());
            br.readLine();
            br.readLine();
            br.readLine();
            Rules.notAgreed=Integer.parseInt(br.readLine());
            br.close();
        }
        catch(Exception ex)
        {
        }
    }
    static String readTime(String id)throws Exception
    {   
        String time="";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id + "cred.txt"));
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            time=br.readLine();
            br.readLine();
            br.readLine();
            br.close();
        }
        catch(Exception ex)
        {
        }
        return time;
    }
    static String readCsv(String id)throws Exception
    {   
        String csv="";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id + "cred.txt"));
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            br.close();
        }
        catch(Exception ex)
        {
        }
        return csv;
    }
    static void readCsv2(String id,int s)throws Exception
    {   
        String csv="";int age=0;String k=""; 
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id + "cred.txt"));
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            age=Integer.parseInt(br.readLine())+s;
            csv=csv+String.valueOf(age)+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            csv=csv+br.readLine()+"\n";
            br.close();
        }
        catch(Exception ex)
        {
        }
        fileWriting.WriteCred2(id,csv);
    }
    static String readFirstName(String id)throws Exception
    {   
        String fName="";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id + "cred.txt"));
            br.readLine();
            br.readLine();
            fName=br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.close();
        }
        catch(Exception ex)
        {
        }
        return fName;
    }
    static double getSBalance(String id)throws Exception
    {
        String[] accountArr = new String[2];
        double balance=0;
        try
        {
           BufferedReader br=new BufferedReader(new FileReader(id +"S.txt"));
            for(int i=0 ; i<2 ; i++)
           {
              accountArr[i] =br.readLine();
           }
           balance=Double.parseDouble(accountArr[1]);
           br.close();
        }
        catch(Exception ex)
        {
        }
        return balance;
    }
    static double getCBalance(String id)throws Exception
    {
        String[] accountArr = new String[2];
        double balance=0;
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id +"C.txt"));
             for(int i=0 ; i<2 ; i++)
            {
               accountArr[i] =br.readLine();
            }
            balance=Double.parseDouble(accountArr[1]);
            br.close();
        }
        catch(Exception ex)
        {
        }
        return balance;
    }
    static double getSLoanBalance(String id)throws Exception
    {
        String[] accountArr = new String[3];
        double balance=0;
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id +"SLoan.txt"));
             for(int i=0 ; i<3 ; i++)
            {
               accountArr[i] = br.readLine();
            }
            balance=Double.parseDouble(accountArr[2]);
            Loan.takenLoan=Integer.parseInt(accountArr[1]);
            br.close();
        }
        catch(Exception ex)
        {
        }
        return balance;
    }
    static double getCLoanBalance(String id)throws Exception
    {
        String[] accountArr = new String[3];
        double balance=0;
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(id +"CLoan.txt"));
             for(int i=0 ; i<3 ; i++)
            {
               accountArr[i] = br.readLine();
            }
            balance=Double.parseDouble(accountArr[2]);
            Loan.takenLoan=Integer.parseInt(accountArr[1]);
            br.close();
        }
        catch(Exception ex)
        {
        }
        return balance;
    }
    static int readSSimulatedYearNumber(String id)throws Exception
    {
        BufferedReader br=new BufferedReader(new FileReader(id+"SSimulatedYear.txt"));
        int yrs=Integer.parseInt(br.readLine());
        br.close();
        return yrs;
    }
    static int readCSimulatedYearNumber(String id)throws Exception
    {
        BufferedReader br=new BufferedReader(new FileReader(id+"CSimulatedYear.txt"));
        int yrs=Integer.parseInt(br.readLine());
        br.close();
        return yrs;
    }
}