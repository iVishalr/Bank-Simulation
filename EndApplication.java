import java.io.*;
class EndApplication
{
    static void end()throws Exception 
    {
        for(int i=25;i>0;i--)
            {
              for(int j=0;j<=17;j++)
                    System.out.println();
              for(double j=0;j<i-21.9;j=j+0.5)
                {
                    System.out.println();
                }
              System.out.println("\t\t\t\t\t  Design Team   : Aaditya.D.Pai and Vishal.R\t\tCoding Team   : Aaditya.D.Pai and Vishal.R   \n");
              for(double j=0;j<i-21.9;j=j+0.5)
                {
                    System.out.println();
                }
              System.out.println("\t\t\t\t\t  Testing Team  : Aaditya.D.Pai and Vishal.R\t\tExecutive Team: Aaditya.D.Pai and Vishal.R \n");
              for(double j=0;j<i-21.9;j=j+0.5)
                {
                    System.out.println();
                }
              System.out.println("\t\t\t\t\t\t\t\t        Marketing Team: Aaditya.D.Pai and Vishal.R ");
              Thread.sleep(400);
              if(i==15)
              {
                  Thread.sleep(500);
                  System.out.print("\u000c");
                  break;
              }
              System.out.print("\u000c");
            }
        System.out.print("                THANK YOU FOR CHOOSING OUR SERVICES");
        Thread.sleep(1500);
        System.exit(0);
    }
}