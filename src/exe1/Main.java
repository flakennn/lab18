package exc;

public class Main {
    public static void main(String[] args) {
        try
        {
            System.err.print(" 0");
            int x = 10/0;
            System.err.print(" 1");
        }
        catch (Exception e)
        { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }// end main
}

