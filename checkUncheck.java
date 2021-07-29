package checkuncheckexcpton;

//import java.io.*;

class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance should not be less then 5000";
    }
}
public class CheckUncheckExcpton 
{
    static void fun1()
    {
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
       // FileInputStream fI=new FileInputStream("My.txt");
//        try
//        {
//        System.out.println(10/0);
//        }
//        catch(Exception e)
//        {
//           System.out.println(e.getMessage());
//           e.printStackTrace();//This method is not Sugestable
//        }
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }

    
   
    public static void main(String[] args)
    {
      fun3();
    }
    
}
