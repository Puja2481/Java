package UnitOne.SampleQuestions;

import java.io.IOException;
import java.util.Scanner;

//find the sum of n natural numbers
public class SumOfNNaturalNumbers {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter n");
        int n = sc.nextInt();
        int sum = ((n*(n+1))/2) ;
        System.out.println("Sum is: "+sum);
        }
        finally{
            sc.close();
        }
    }
}
