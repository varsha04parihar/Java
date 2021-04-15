import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
           br = new BufferedReader(new FileReader("data.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
