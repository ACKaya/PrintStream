import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream printStream=new PrintStream("text.txt");
            printStream.print("Batuhan Boz");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
