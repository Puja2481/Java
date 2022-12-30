package UnitOne.SampleQuestions;

import java.io.IOException;
import java.util.Scanner;
/*
Given two integer d and n. Where d is the day, out of 7 days of week, d varies from 0 to 6 as shown below.

0 - Sunday

1 - Monday

2 - Tuesday

3 - Wednesday

4 - Thursday

5 - Friday

6 - Saturday

Print index for the day which is n days before the given day d.

 */
public class DayBeforeNDays {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter n (days before)");
            int n = sc.nextInt();
            System.out.println("Enter d (current day)");
            int d = sc.nextInt();

            n= (n<7)?n:n%7;
            int res=(d-n+7)%7;
            System.out.println(res);
        }
        finally{
            sc.close();
        }
    }
}
