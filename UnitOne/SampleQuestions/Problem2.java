package UnitOne.SampleQuestions;

//Write a program to convert temperature given in Celsius (user input) to Fahrenheit.

public class Problem2 {
    public static void main(String[] args) {
        int cel1 = 47;
        int cel2 = 29;
        
        System.out.printf("47 deg Celsius in Fahrenheit: %.2f\n", (9.0/5*cel1 + 32) ); //47 deg Celsius in Fahrenheit: 116.60
        System.out.printf("29 deg Celsius in Fahrenheit: %.2f\n", (9.0/5*cel2 + 32) ); //29 deg Celsius in Fahrenheit: 84.20
    }
}
