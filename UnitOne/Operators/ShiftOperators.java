

/* 
*  Shift Operators :These operators are used to shift the bits of a number left or right thereby multiplying or 
*  dividing the number by two respectively. They can be used when we have to multiply or divide a number by two. General format-
*  number shift_op number_of_places_to_shift;
*  << , Left shift operator: shifts the bits of the number to the left and fills 0 
*  on voids left as a result. Similar effect as of multiplying the number with some power of two.
*  >> , Signed Right shift operator: shifts the bits of the number to the right and fills 0
*  on voids left as a result. The leftmost bit depends on the sign of initial number. 
*  Similar effect as of dividing the number with some power of two.
*  >>> , Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 
*  on voids left as a result. The leftmost bit is set to 0. 
*/
public class ShiftOperators {
    public static void main(String[] args) {
        int a = 0x0005;
        int b = -10;

        //https://open4tech.com/logical-vs-arithmetic-shift/
        
        // left shift operator
        // 0000 0101<<2 =0001 0100(20)
        // similar to 5*(2^2)
        System.out.println("a<<2 = " + (a << 2)); //a<<2 = 20

        // right shift operator
        // 0000 0101 >> 2 =0000 0001(1)
        // similar to 5/(2^2)
        System.out.println("a>>2 = " + (a >> 2)); //a>>2 = 1
        
        // unsigned right shift operator
        System.out.println("b>>>2 = "+ (b >>> 2)); //b>>>2 = 1073741821
    }
}
