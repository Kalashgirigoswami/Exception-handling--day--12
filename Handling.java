public class Handling extends Exception1 {
    void msg() throws Exception {
        System.out.println("child method");

    }

    public static void main(String args[]) {
        Handling h = new Handling();
        try {
            h.msg();
        } catch (Exception e) {
        }
    }
}