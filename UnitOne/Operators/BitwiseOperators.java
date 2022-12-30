
/*
* Bitwise Operators : These operators are used to perform manipulation of individual bits of a number.
* They can be used with any of the integer types. They are used when performing update and query operations of Binary indexed tree.
* & , Bitwise AND operator: returns bit by bit AND of input values.
* | , Bitwise OR operator: returns bit by bit OR of input values.
* ^ , Bitwise XOR operator: returns bit by bit XOR of input values.
* ~ , Bitwise Complement Operator: This is a unary operator which returns the one's compliment representation of the input value, i.e., with all bits inversed.
*/
public class BitwiseOperators {
    public static void main(String[] args) {
        //if int a = 010 java considers it as octal value of 8 as number starts with 0.
        int a = 0x0005; // https://decimal.info/hex-to-decimal/0/how-to-convert-0X0005-to-decimal.html
        int b = 0x0007; // https://decimal.info/hex-to-decimal/0/how-to-convert-0X0007-to-decimal.html

        // bitwise and
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b)); //a&b = 5

        // bitwise and
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b)); //a|b = 7

        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b)); //a^b = 2

        // bitwise and
        // ~0101=1010
        System.out.println("~a = " + ~a); //~a = -6

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a); //a= 5
    }
}
