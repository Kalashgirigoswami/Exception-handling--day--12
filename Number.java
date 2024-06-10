public class Number {
    public static void main(String args[]){
        System.out.println("1");
        try {
            System.out.println("2");
            int a=10,b=0,c=7;
            System.out.println("3");
            b=a/c;
            System.out.println(b);
            System.out.println("4");
        }
        catch (ArithmeticException e)
        {
            System.out.println("5");
            System.out.println("6");
        }
        System.out.println("hello world");
    }
}
