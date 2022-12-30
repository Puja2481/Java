
/*
* Arithmetic Operators: They are used to perform simple arithmetic operations on primitive data types.
* * : Multiplication
* / : Division
* % : Modulo
* + : Addition
* - : Subtraction
*/

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20, b = 10;
        String x = "Thank", y = "You";

        // + and - operator
        System.out.println("a + b = "+(a + b)); //a + b = 30
        System.out.println("a - b = "+(a - b)); //a - b = 10

        // + operator if used with strings
        // concatenates the given strings.
        System.out.println("x + y = "+x + y); //x + y = ThankYou

        // * and / operator
        System.out.println("a * b = "+(a * b)); //a * b = 200
        System.out.println("a / b = "+(a / b)); //a / b = 2

        // modulo operator gives remainder
        // on dividing first operand with second
        System.out.println("a % b = "+(a % b)); //a % b = 0

        // if denominator is 0 in division
        // then Arithmetic exception is thrown.
        // uncommenting below line would throw
        // an exception
        // System.out.println(a/c);

    }
}
