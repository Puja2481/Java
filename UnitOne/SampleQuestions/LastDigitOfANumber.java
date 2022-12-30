package UnitOne.SampleQuestions;

import java.util.Scanner;
import java.io.IOException;
//Find the last digit of a number
public class LastDigitOfANumber {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int y = Math.abs(n);
            int ans = y % 10;
    
            System.out.println(ans);
        }
        finally{
            sc.close();
        }
    }
}
