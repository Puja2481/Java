
/*
* Relational Operators : These operators are used to check for relations such as equality, greater than, less than.
* They return boolean result after the comparison and are extensively used in looping statements as well as in conditional 
* if else statements.
* 
* Some of the relational operators are:
* == , Equal to : returns true of left hand side is equal to right hand side.
* != , Not Equal to : returns true of left hand side is not equal to right hand side.
* < , less than : returns true of left hand side is less than right hand side.
* <= , less than or equal to : returns true of left hand side is less than or equal to right hand side.
* > , Greater than : returns true of left hand side is greater than right hand side.
* >= , Greater than or equal to: returns true of left hand side is greater than or equal to right hand side.
*/
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean condition = true;

        //various conditional operators
        System.out.println("a == b :" + (a == b)); //a == b :false
        System.out.println("a < b :" + (a < b)); //a < b :false
        System.out.println("a <= b :" + (a <= b)); //a <= b :false
        System.out.println("a > b :" + (a > b)); //a > b :true
        System.out.println("a >= b :" + (a >= b)); //a >= b :true
        System.out.println("a != b :" + (a != b)); //a != b :true

        // Arrays cannot be compared with
        // relational operators because objects
        // store references not the value
        System.out.println("x == y : " + (ar == br)); //x == y : false

        System.out.println("condition==true :" + (condition == true)); //condition==true :true
    }
}
