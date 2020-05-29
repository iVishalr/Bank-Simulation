import java.io.*;
public class Employees
{  
    static String name,ID;
    static void accept(String n,String acNumber)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        name=n;
        ID=acNumber;
        System.out.println(""+name+"  "+ID);
        System.out.print("\t\t\t\t\t");
        for(int j=0;j<=100;j++)
           System.out.print("-");  
    }
    static void emp(String a[])throws Exception
    {
        System.out.print("\t\t\t\t\t");
        for(int i=0;i<a.length;i++)
           System.out.print(a[i]);
    }
    static void employees()throws Exception
    {
        System.out.println("\u000c");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Employees[]e=new Employees[4];
        String EmpNames[]={"\n\t\t\t\t\t|CO FOUNDERS         -    Aaditya.D.Pai & Vishal.R          |","\n\t\t\t\t\t|General Managers    -\t\tNishanth.S                  |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tRishab.K.S                  |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tSagar.M                     |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tTeja,J.P.S                  |","\n\t\t\t\t\t|Server Maintenance  -\t\tTarun K \t            |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tNitesh\t                    |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tChirag.B\t            |","\n\t\t\t\t\t|Account Maintenance -\t\tBharath.V.B\t            |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tSanjana B\t            |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tAnusha M.S\t            |\t\t\t\t\t    |\n\t\t\t\t\t|\t\t\t\tPrerna.D                    |"};
        String acNumb[]={"                    N/A              |","   8746392,5782358,2216387,9891929   |","\t\t5362889,8881922,6152833     |","\t   1083134,9967234,8802742,8926734  |"};
        
        System.out.println("\n\n\n\n\n\n\n\n");
        for(int i=0;i<EmpNames.length;i++)
        {
            e[i]=new Employees();
            if(i==0)
            {    
                System.out.print("\t\t\t\t\t");
                for(int j=0;j<=100;j++)
                    System.out.print("-");
            }
            if(i==0)
                 System.out.println("\n\t\t\t\t\t|                             Account Holders               |                 Account Numbers       |   ");   
            if(i==0)
            {    
                System.out.print("\t\t\t\t\t");
                for(int j=0;j<=100;j++)
                    System.out.print("-");
            }
            e[i].accept(EmpNames[i],acNumb[i]);
        }  
        String[] a={"\n\n\t\t\t\t\t\t\t\t\tIT IS UNLAWFUL TO ACCESS THE"," EMPLOYEE ACCOUNTS"};
        emp(a);
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t    Press enter to continue\n\t\t\t\t\t\t\t\t\t\t\t\t");
        br.read();
        BeginApplication.l();
    }
}