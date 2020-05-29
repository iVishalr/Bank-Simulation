import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
class Account_Information
{
    static int k=0;
    static int Container=0;
    static String h="";
    static String n="";
   public static void Info()throws Exception
   {  
      int j=1,i=1;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ProjectHeader.headerLineForStarting();
      System.out.println("\n\t\t\t\t\t\t\t\t\t     ACCOUNT INFORMATION");
      for(i=1;i<=180;i++)
      {
            System.out.print("_");
      }
      System.out.println("\nAccount Number      : "+Bank.Account);
      System.out.println("First Name          : "+Accounta.firstName.toUpperCase());
      System.out.println("Last Name           : "+Accounta.lastName.toUpperCase());
      System.out.println("Email - ID          : "+Accounta.ID);
      System.out.println("Address             : "+Accounta.Add.toUpperCase());
      System.out.println("City                : "+Accounta.City.toUpperCase());
      System.out.println("State               : "+Accounta.State.toUpperCase());
      System.out.println("Country             : "+Accounta.Country.toUpperCase());
      System.out.println("Pincode             : "+Accounta.Pincode);
      System.out.println("Born on   :   Date  : "+Accounta.Date);
      System.out.println("              Month : "+Accounta.Month);
      System.out.println("              Year  : "+Accounta.Year);
      System.out.println("Age                 : "+Accounta.age);
      System.out.println("Phone Number        : "+Accounta.ph);
      System.out.println("\n\nYOUR ACCOUNT NUMBER AND PASSWORD IS VERY IMPORTANT.DONOT SHARE IT ");
      System.out.println("WITH ANYONE.ALSO BOTH ARE REQUIRED FOR ANY OTHER TRANSACTION,SO PLEASE");
      System.out.println("NOTE IT DOWN");
      do
      {
          System.out.print("_");
          j++;
      }
      while(j<=179);    
      Thread.sleep(10000);
      System.out.println("\nPlease press SHOW to show your password again");
      System.out.println("Else if not required press Y key to continue");
      int flag=0;
      do
      {
          flag=0;
          try
          {
              String y=br.readLine();
              String h="SHOW";
              if(h.equalsIgnoreCase(y))
              { 
                  System.out.print("\u000c");
                  for(j=10;j>0;j--)
                  {   
                      if(j<=10)
                      {
                          for(int d=2;d>0;d--)
                          {
                              ProjectHeader.headerLineForStarting();
                              System.out.println("\n\t\t\tThe password is "+Bank.Password);
                              if(d%2==0)
                              {
                                  System.out.print("\n\n\t\tPlease note down your password in  ");
                                  System.out.print(j+" seconds.");
                                }
                                Thread.sleep(650);
                                System.out.println("\u000C");
                          }
                      }
                      else
                      {
                          ProjectHeader.headerLineForStarting();
                          System.out.println("\n\t\t\tThe password is "+Bank.Password);
                          System.out.print("\n\n\t\tPlease note down your password in  ");
                          System.out.print(j+" seconds.");
                          System.out.println("\u000C");
                      }      
                  }
                  k++;
                  if(Accounta.a_type.equals("C"))
                  {
                      fileWriting.WriteCAccount(Bank.pan,String.valueOf(Bank.Account));
                  }
                  else if(Accounta.a_type.equals("S"))
                  {  
                      fileWriting.WriteSAccount(Bank.pan,String.valueOf(Bank.Account));
                  }
                  Thread.sleep(5000);
                  int flag1=0;
                  do
                  {
                      flag1=0;
                      try
                      {
                        Money.deposit();
                        double b=0;
                          if(Accounta.a_type.equals("S"))
                            b=fileReading.getSBalance(Bank.pan);
                        else if(Accounta.a_type.equals("C"))
                            b=fileReading.getCBalance(Bank.pan);
                        if(b<0)
                        {
                            throw new Exception();
                        }
                      }
                      catch(Exception e)
                      {
                            System.out.println("Amount entered is invalid.");
                            System.out.println("Please re-enter it");
                            Thread.sleep(2000);
                            flag1=1;
                      }
                  }
                  while(flag1==1);
                  transferControl();
                }
              String y1="Y";
              if(y.equalsIgnoreCase(y1))
                {
                    System.out.print("\u000c");
                    k++;
                    Thread.sleep(5000);
                    if(Accounta.a_type.equals("C"))
                    {
                        fileWriting.WriteCAccount(Bank.pan,String.valueOf(Bank.Account));
                    }
                    else if(Accounta.a_type.equals("S"))
                    {
                        fileWriting.WriteSAccount(Bank.pan,String.valueOf(Bank.Account));
                    }
                    int flag1=0;
                    do
                    {
                      flag1=0;
                      try
                      {
                        Money.deposit();
                        double b=0;
                          if(Accounta.a_type.equals("S"))
                            b=fileReading.getSBalance(Bank.pan);
                        else if(Accounta.a_type.equals("C"))
                            b=fileReading.getCBalance(Bank.pan);
                        if(b<0)
                        {
                            throw new Exception();
                        }
                      }
                      catch(Exception e)
                      {
                            System.out.println("Amount entered is invalid.");
                            System.out.println("Please re-enter it");
                            Thread.sleep(2000);
                            flag1=1;
                      }
                    }
                    while(flag1==1);
                    transferControl();
              }
              else 
                    throw new Exception();
          }
          catch(Exception e)
          {
              System.out.println("Please enter a valid menu choice");
              flag=1;
              Thread.sleep(1500);
          }
      }
      while(flag==1);
    }   
   static void transferControl()throws Exception
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int control=0;
      String enter="";
      int flag=0;
      do
      {
          try
          {
              flag=0;
              if(k>=1)
              {
                  if(k>=1 && control==0)
                  {
                      System.out.print("\u000c");
                      ProjectHeader.headerLineForStarting();
                      System.out.println("\nDo you require a locker. \nIf Yes press enter else if not required press NO");
                      System.out.println("You have to pay certain amount,based on the size of the locker,inorder to own a locker");
                      String j=br.readLine();
                      if("".equals(j) && control>=0)
                      {
                          h="";
                          System.out.println("Please select your locker size");
                          System.out.println(" 1 40 liters");
                          System.out.print(" 2 60 liters\n 3 120 liters\n 4 240 liters\n ");
                          Container=Integer.parseInt(br.readLine());
                          if(Container<1 || Container>4)
                                throw new Exception();
                          switch(Container)
                          {
                              case 1: 
                                     if(Accounta.a_type.equals("C"))
                                     {
                                         System.out.println("You have to pay Rs "+40*6.5+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getCBalance(Bank.pan);
                                         balance=balance-40*6.5;
                                         fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                                     }
                                     if(Accounta.a_type.equals("S"))
                                     {
                                         System.out.println("You have to pay Rs "+40*6.5+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getSBalance(Bank.pan);
                                         balance=balance-40*6.5;
                                         fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                                     }
                                     break;
                              case 2: 
                                     if(Accounta.a_type.equals("C"))
                                     {
                                         System.out.println("You have to pay Rs "+60*5.5+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getCBalance(Bank.pan);
                                         balance=balance-60*5.5;
                                         fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                                     }
                                     if(Accounta.a_type.equals("S"))
                                     {
                                         System.out.println("You have to pay Rs "+60*5.5+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getSBalance(Bank.pan);
                                         balance=balance-60*5.5;
                                         fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));
                                     }
                                     break;
                              case 3: 
                                     if(Accounta.a_type.equals("C"))
                                     {
                                         System.out.println("You have to pay Rs "+120*4.5+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getCBalance(Bank.pan);
                                         balance=balance-120*4.5;
                                         fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));
                                     }
                                     if(Accounta.a_type.equals("S"))
                                     {
                                         System.out.println("You have to pay Rs "+120*4.5+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getSBalance(Bank.pan);
                                         balance=balance-120*4.5;
                                         fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));                                 
                                     }
                                     break;
                              case 4:
                                     if(Accounta.a_type.equals("C"))
                                     {
                                         System.out.println("You have to pay Rs "+240*4.45+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getCBalance(Bank.pan);
                                         balance=balance-240*4.45;
                                         fileWriting.CAccountDeposit(Bank.pan,String.valueOf(balance));                                
                                     }
                                     if(Accounta.a_type.equals("S"))
                                     {
                                         System.out.println("You have to pay Rs "+240*4.45+" every year.\nPress Enter to pay.");
                                         br.read();
                                         double balance=fileReading.getSBalance(Bank.pan);
                                         balance=balance-240*4.45;
                                         fileWriting.SAccountDeposit(Bank.pan,String.valueOf(balance));                               
                                     }
                                     break;
                          }
                          System.out.print("\u000c");
                          if(Accounta.a_type.equals("S"))
                          {
                              fileWriting.SLoanAccount(Bank.pan,"0","0");
                              fileWriting.writeSSimulatedYearNumber(Bank.pan,0);
                          }
                          if(Accounta.a_type.equals("C"))
                          {
                              fileWriting.CLoanAccount(Bank.pan,"0","0");
                              fileWriting.writeCSimulatedYearNumber(Bank.pan,0);
                          }
                          Calendar cal = Calendar.getInstance();   
                          Date today = cal.getTime();
                          String csv = Bank.pan+"\n"+Bank.Password+"\n"+Accounta.firstName.toUpperCase()+"\n";
                          csv=csv+Accounta.lastName.toUpperCase()+"\n"+Accounta.ID+"\n"+Accounta.Add.toUpperCase()+"\n"+Accounta.City.toUpperCase()+"\n";
                          csv=csv+Accounta.State.toUpperCase()+"\n"+Accounta.Country.toUpperCase()+"\n"+Accounta.Pincode+"\n"+Accounta.Date+"\n"+Accounta.Month+"\n";
                          csv=csv+Accounta.Year+"\n"+Accounta.age+"\n"+Accounta.a_type+"\n"+String.valueOf(Container)+"\n"+today+"\n"+Accounta.ph+"\n";
                          fileWriting.WriteCred(Bank.pan,csv);
                          Rules.forNext();                          
                          System.out.print("\u000c\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n   \t\t\t\t\t\t\t\tYOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED!");
                          Thread.sleep(3500);
                          BeginApplication.l();
                      } 
                      else if(j.equalsIgnoreCase("NO"))
                      {
                          n="no";
                          Calendar cal = Calendar.getInstance();   
                          Date today = cal.getTime();
                          if(Accounta.a_type.equals("S"))
                          {
                              fileWriting.SLoanAccount(Bank.pan,"0","0");
                              fileWriting.writeSSimulatedYearNumber(Bank.pan,0);
                          }
                          if(Accounta.a_type.equals("C"))
                          {
                              fileWriting.CLoanAccount(Bank.pan,"0","0");
                              fileWriting.writeCSimulatedYearNumber(Bank.pan,0);
                          }
                          String csv = Bank.pan+"\n"+Bank.Password+"\n"+Accounta.firstName.toUpperCase()+"\n";
                          csv=csv+Accounta.lastName.toUpperCase()+"\n"+Accounta.ID+"\n"+Accounta.Add.toUpperCase()+"\n"+Accounta.City.toUpperCase()+"\n";
                          csv=csv+Accounta.State.toUpperCase()+"\n"+Accounta.Country.toUpperCase()+"\n"+Accounta.Pincode+"\n"+Accounta.Date+"\n"+Accounta.Month+"\n";
                          csv=csv+Accounta.Year+"\n"+Accounta.age+"\n"+Accounta.a_type+"\n"+String.valueOf(Container)+"\n"+today+"\n"+Accounta.ph+"\n";
                          fileWriting.WriteCred(Bank.pan,csv);
                          System.out.print("\u000c");
                          Rules.forNext();
                          System.out.print("\u000c\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n   \t\t\t\t\t\t\t\tYOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED!");
                          Thread.sleep(3500);
                          BeginApplication.l();
                      }
                      else 
                         throw new Exception();
                  }
                  else
                          Bank_Menu.display_Menu(); 
              }
          }
          catch(Exception e)
          {
              System.out.println("Please enter a valid menu choice");
              Thread.sleep(2000);
              control=1;
              transferControl();
              flag=1;
          }
       }
       while(flag==1);
   }
}    