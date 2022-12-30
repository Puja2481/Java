package UnitOne.SampleQuestions;
/*
There are times when your answer is a floating point that contains undesired amount of digits after decimal. 
Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b. 
You need to output a/b and decimal precision of a/b upto 3 places after decimal point.
Note: You may use System.out.format()

Example 1:

Input:
5.43 2.653

Output:
2.046739 2.047
Example 2:

Input:
3.25 2.5

Output:
1.3 1.300

Constraints:
1 <= a, b,<= 100
 */

import java.io.IOException;
import java.util.Scanner;

public class PreciseFormat {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first Number");
            float a = sc.nextFloat();
            System.out.println("Enter Second Number");
            float b = sc.nextFloat();
            float result = a/b;
            System.out.print(result+" ");
            System.out.printf("%.3f",result);
        }
        finally{
            sc.close();
        }
    }
}

