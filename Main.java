import java.io.FileNotFoundException;
import java.io.IOException;

public class Main extends Exception1 {
    void msg() throws Exception {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Exception1 e = new Main();
        try {
            e.msg();
        } catch (Exception e1) {
        }
    }
}