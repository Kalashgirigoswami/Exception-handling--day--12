public class Exception1 {
    public static void main(String args[])
    {
        try {
            try {
                System.out.println("going to divide by zero..");
                int b = 38 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 7;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");
        } finally {
            System.out.println("program continue");
        }

        System.out.println("normal flow");
    }
}