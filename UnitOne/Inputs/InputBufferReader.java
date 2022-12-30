
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args) throws IOException{
        //Enter data using Buffer reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Reading data using readline
        String string = reader.readLine();
        //Printing the readline
        System.out.println(string);
    }
}
