package UnitOne.DataTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        boolean b = true;       
        if (b == true)
            System.out.println("Hey, Puja! You are awesome :)"); //Hey, Puja! You are awesome :)
    
        byte a = 126;

        // byte is 8 bit value
        System.out.println(a); //126
           
        a++;
        System.out.println(a); //127
            
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a); //-128
            
        // Looping back within the range
        a++;
        System.out.println(a); //-127

        // declaring character
        char a1 = 'G';
         
        // Integer data type is generally 
        // used for numeric values
        int i=89;
        
        // use byte and short if memory is a constraint 
        byte b1 = 4;
        
        // this will give error as number is 
        // larger than byte range
        // byte b1 = 7888888955;
        
        short s = 56;
        
        // this will give error as number is 
        // larger than short range
        // short s1 = 87878787878;
        
        
        // by default fraction value is double in java
        double d = 4.355453532;
        
        // for float use 'f' as suffix
        float f = 4.7333434f;
       
        System.out.println("char: " + a1); //char: G
        System.out.println("integer: " + i); //integer: 89
        System.out.println("byte: " + b1); //byte: 4
        System.out.println("short: " + s); //short: 56
        System.out.println("float: " + f); //float: 4.7333436
        System.out.println("double: " + d); //double: 4.355453532


    }
}
