package UnitOne.SampleQuestions;
//Write a program to find the area of a triangle. Take the length of sides as user input. 
//(Area printed should be rounded off to two decimal places).
public class Problem3 {
    public static void main(String[] args) {
        int a = 6, b = 8, c = 10;
        
        //We shall use heron's formula to calculate triangle area
        double s = (a + b + c)/2.0;
        
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.printf("Area of the Triangle : %.2f\n",area);
    }
}
