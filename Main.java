import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
           try
           {

               int result=divide(10,0);
               System.out.println("result = "+result);
           }
           catch(ArithmeticException e)
           {
               System.out.println("cannot divide by zero..");
           }
           catch (Exception e)
           {
               System.out.println("an error ocuured:"+e.getMessage());
           }
           finally {
               System.out.println("program completed");
           }
    }
    public static int divide(int n1,int n2) throws ArithmeticException
    {
        if (n2==0)
        {
            throw new ArithmeticException("cannot be divided");
        }
        return n1/n2;
    }
}