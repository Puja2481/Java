

/*
* Unary Operators: Unary operators need only one operand. They are used to increment, decrement, or negate a value.
* - :Unary minus is used for negating the values.
* + :Unary plus is used for giving positive values. Only used when deliberately converting a negative value to a positive value.
* ++ :Increment operator is used for incrementing the value by 1. There are two varieties of increment operator.
*       * Post-Increment : Value is first used for computing the result, and then it is incremented.
*       * Pre-Increment : Value is incremented first, and then the result is computed.
* -- : Decrement operator is used for decrementing the value by 1. There are two varieties of decrement operator.
*       * Post-decrement : Value is first used for computing the result, and then it is decremented.
*       * Pre-Decrement : Value is decremented first, and then the result is computed.
* ! : Logical not operator is used for inverting a boolean value.
*/

public class UnaryOperators {
    public static void main(String[] args) 
    {
        int a = 20, b = 10, c = 0, d = 20, e = 40;
        boolean condition = true;

        // pre-increment operator
        // a = a+1 and then c = a;
        c = ++a;
        System.out.println("Value of c (++a) = " + c); //Value of c (++a) = 21

        // post increment operator
        // c=b then b=b+1
        c = b++;
        System.out.println("Value of c (b++) = " + c); //Value of c (b++) = 10

        // pre-decrement operator
        // d=d-1 then c=d
        c = --d;
        System.out.println("Value of c (--d) = " + c); //Value of c (--d) = 19

        // post-decrement operator
        // c=e then e=e-1
        c = e--;
        System.out.println("Value of c (e--) = " + c); //Value of c (e--) = 40

        // Logical not operator
        System.out.println("Value of !condition =" + !condition); //Value of !condition =false

    }
}
