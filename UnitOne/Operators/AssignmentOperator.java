
/*
* Assignment Operator : '=' Assignment operator is used to assign a value to any variable. It has a right to left associativity, 
* i.e., the value given on the right hand side of the operator is assigned to the variable on the left; therefore, right hand side 
* value must be declared before using it or it should be a constant.
* 
* In many cases assignment operator can be combined with other operators to build a shorter version of statement 
* called Compound Statement. For example, instead of a = a+5 , we can write a += 5.
* 
* +=, for adding left operand with right operand and then assigning it to variable on the left.
* -=, for subtracting left operand with right operand and then assigning it to variable on the left.
* *=, for multiplying left operand with right operand and then assigning it to variable on the left.
* /=, for dividing left operand with right operand and then assigning it to variable on the left.
* %=, for assigning modulo of left operand with right operand and then assigning it to variable on the left.
*/

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 20, b = 10, c, e = 10, f = 4;

        // simple assignment operator
        c = b;
        System.out.println("Value of c = " + c); //Value of c = 10

        // This following statement would throw an exception
        // as value of right operand must be initialised
        // before assignment, and the program would not
        // compile.
        // c = d;

        // instead of below statements,shorthand
        // assignment operators can be used to
        // provide same functionality.
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a,b,e,f = " + a + "," + b + "," + e + "," + f); //a,b,e,f = 21,9,20,2
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;

        // shorthand assignment operator
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a,b,e,f (using shorthand operators)= " + a + "," + b + "," + e + "," + f); //a,b,e,f (using shorthand operators)= 21,9,20,2
 
    }
}
