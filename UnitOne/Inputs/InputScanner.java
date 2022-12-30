
import java.io.IOException;
import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args) throws IOException {
        //Scanner to get the input
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a string");
            String s = sc.nextLine();
    
            System.out.println("Enter a int");
            int a = sc.nextInt();
    
            System.out.println("Enter a float");
            float b = sc.nextFloat();
            
            System.out.println(s+"\n"+a+"\n"+b);
            //System.out.println(a);
            //System.out.println(b);
        }
        finally{
            sc.close();
        }
    }
}
