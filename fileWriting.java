import java.io.*;
class fileWriting
{
    static void WriteCred(String id , String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(id+"cred.txt",true));
        PrintWriter mm=new PrintWriter(b);
        mm.print(data);
        mm.close();
    }
    static void WriteCred2(String id , String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(id+"cred.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.print(data);
        mm.close();
    }
    static void WrittenCredRemover(String id , String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(id+"cred.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.print("");
        mm.close();
    }
    static void WriteSAccount(String panId,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId +"S.txt",true));
        PrintWriter mm=new PrintWriter(b);
        mm.print(data);
        mm.close();
    }
    static void SAccountDeposit(String panId,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId +"S.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println(panId);
        mm.println(data);
        mm.close();
    }
    static void SLoanAccount(String panId,String Loan,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"SLoan.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println(panId);
        mm.println(Loan);
        mm.println(data);
        mm.close();
    }
    static void SLoanAccountRemover(String panId)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"SLoan.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println("");
        mm.close();
    }
    static void CLoanAccountRemover(String panId)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"CLoan.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println("");
        mm.close();
    }
    static void WriteCAccount(String panId,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"C.txt",true));
        PrintWriter mm=new PrintWriter(b);
        mm.print(data);
        mm.close();
    }
    static void CAccountDeposit(String panId,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"C.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println(panId);
        mm.println(data);
        mm.close();
    }
    static void CLoanAccount(String panId,String Loan,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"CLoan.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println(panId);
        mm.println(Loan);
        mm.println(data);
        mm.close();
    }
    static void CAccountDeleter(String panId,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"C.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.print("");
        mm.close();
    }
    static void SAccountDeleter(String panId,String data)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(panId+"S.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.print("");
        mm.close();
    }
    static void writeSSimulatedYearNumber(String id,int yrs)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(id+"SSimulatedYear.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println(yrs);
        mm.close();
    }
    static void writeCSimulatedYearNumber(String id,int yrs)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b=new BufferedWriter(new FileWriter(id+"CSimulatedYear.txt",false));
        PrintWriter mm=new PrintWriter(b);
        mm.println(yrs);
        mm.close();
    }
}