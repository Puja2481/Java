package UnitOne.SampleQuestions;

import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;
//Find the n-th term of an ap
public class NthTermOfGP {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first term of a GP Series");
            int a= sc.nextInt();
            System.out.println("Enter common ratio of a GP Series");
            int r= sc.nextInt();
            System.out.println("Enter which term is to calculated");
            int n= sc.nextInt();  
            double num = a*Math.pow(r, n-1);
            System.out.println("Number is: "+ num);
        }
        finally{
            sc.close();
        }

    }
}
