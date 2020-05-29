class Interest
{
    static double interest;
    static double interest()throws Exception
    {   
      if(Accounta.a_type.equals("C"))
      {
        if(Accounta.age<18)
        {
            System.out.print("\u000c");
            double P=fileReading.getCBalance(Bank.pan);
            double T=TimeSimulator.t;
            double R=4.25;
            interest=(P*T*R)/100;
        }
        else
        {
          System.out.print("\u000c");
          double P=fileReading.getCBalance(Bank.pan);
          double T=TimeSimulator.t;
          double R=4.15;
          interest=(P*T*R)/100;
        }
      }
      else if(Accounta.a_type.equals("S"))
      {
        if(Accounta.age<18)
        {
            System.out.print("\u000c");
            double P=fileReading.getSBalance(Bank.pan);
            double T=TimeSimulator.t;
            double R=4.25;
            interest=(P*T*R)/100;
        }
        else
        {
          System.out.print("\u000c");
          double P=fileReading.getSBalance(Bank.pan);
          double T=TimeSimulator.t;
          double R=4.15;
          interest=(P*T*R)/100;
        }
      }
      return (int)interest;
    }
}