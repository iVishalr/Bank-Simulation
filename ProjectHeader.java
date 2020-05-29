import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class ProjectHeader
{
    static void presentation()throws Exception
    {
        DesignCreator.startDesign();
    }    
    static void headerLine()throws Exception
    {
        int y=0,years=0;
        String s="";
        s=fileReading.readTime(Bank.pan);
        System.out.print("   ACCOUNT CREATED ON : "+s);
        if(Accounta.a_type.equals("S"))
            years = fileReading.readSSimulatedYearNumber(Bank.pan);
        else if(Accounta.a_type.equals("C"))
            years = fileReading.readCSimulatedYearNumber(Bank.pan);
        Calendar cal = Calendar.getInstance();   
        Date today = cal.getTime();
        cal.add(Calendar.YEAR,years);
        Date nextYear = cal.getTime();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t     "+nextYear);
        System.out.println();
        while(y<=179)
        {
            System.out.print("_");y++;
        }
        System.out.print("\n\n\n\t\t\t\t\t\t\t               ");
        System.out.println("INTERNATIONAL BANK OF BENGALURU \n");
        int y1=0;
        while(y1<=179)
        {
            System.out.print("_");y1++;
        }
        System.out.println();
    }
    static void headerLineForStarting()throws Exception
    {
        int y=0;
        int years=0;
        Calendar cal = Calendar.getInstance();   
        Date today = cal.getTime();
        cal.add(Calendar.YEAR,years);
        Date nextYear = cal.getTime();
        System.out.print("\t\t\t\t\t\t\t\t\t "+nextYear+"\n");
        while(y<=179)
        {
            System.out.print("_");y++;
        }
        System.out.print("\n\n\n\t\t\t\t\t\t\t               ");
        System.out.println("INTERNATIONAL BANK OF BENGALURU \n");
        int y1=0;
        while(y1<=179)
        {
            System.out.print("_");y1++;
        }
        System.out.println();
    }
    static void loading()throws Exception
    {
        System.out.print("\u000c");
        for(int i=1;i<3;i++)
        {
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("\t\t\t\t\t\t\t\t\t\t    Loading\n");
            System.out.print("\t\t\t\t\t\t\t\t\t    ");
            for(int j=1;j<=22;j++)
            {
                System.out.print(".");
                Thread.sleep(75);
            }
            System.out.print("\u000c");
        }
        System.out.print("\u000c");
    }
}