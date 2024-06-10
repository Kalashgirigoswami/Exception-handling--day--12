public class Main {
    int divide(int m, int n) throws ArithmeticException{
        int re;
        re = m/n;
        return re;
    }
    public static void main(String args[])
    {
        Main m=new Main();
        try {
            System.out.println(m.divide(90,0));
        }
        catch (ArithmeticException e){
            System.out.println("\n no. cannot be divide");
        }
        System.out.println("rest of the code");

    }
}