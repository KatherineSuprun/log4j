import businessLogic.FileReader;
import businessLogic.Reader;

public class Application {
    public static void main(String[] args) {

        Reader reader = new FileReader();
        String message = reader.read();
        System.out.println(message);
    }
}
