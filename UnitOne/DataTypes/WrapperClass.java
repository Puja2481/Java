package UnitOne.DataTypes;

// https://www.geeksforgeeks.org/wrapper-classes-java/

public class WrapperClass {
    public static void main(String[] args) {
        int x1 = 10; 
        Integer x2 = x1; //Autoboxing
        int x3 = x2; //Unboxing
        System.out.println("x1:"+x1+"\n\n"+"x2:"+x2+"\n\n"+"x3:"+x3+"\n\n"); 
    }
}
