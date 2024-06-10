public class Exception {
    public static void main(String args[]) {
        int balance = 5000;
        int withdraw = 7000;
        try {
            if (balance < withdraw)

                throw new ArithmeticException("insuffiecent balance");
            balance = balance - withdraw;
            System.out.println("transcation successfully...");
        } catch (ArithmeticException e) {
            System.out.println("exception:" + e.getMessage());
        }
        System.out.println("program continue...");
    }

}
