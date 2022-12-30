package UnitOne.DataTypes;
//Also called Type casting.
// https://www.javatpoint.com/type-casting-in-java
// https://www.tutorialspoint.com/what-is-type-conversion-in-java
public class TypeConversion {
    public static void main(String[] args) {
        //Narrowing
        double d = 65.4;
        int i = (int) d;
        char c = (char) i;
        System.out.println("i: " + i + "\n"+"c:"+c+ "\n\n");

        //Widening
        char ch = 'C';
        int i1 = ch;
        System.out.println(i1);
    }
}
