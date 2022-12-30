package UnitOne.SampleQuestions;

import java.io.IOException;
import java.util.Scanner;

//Find the n-th term of an ap
public class NthTermOfAP {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first term of an AP Series");
            int a= sc.nextInt();
            System.out.println("Enter common difference of an AP Series");
            int d= sc.nextInt();
            System.out.println("Enter which term is to calculated");
            int n= sc.nextInt();  
            System.out.println("Number is: "+ (a+(n-1)*d));
        }
        finally{
            sc.close();
        }
    }
}
