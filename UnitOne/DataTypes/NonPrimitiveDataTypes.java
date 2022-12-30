package UnitOne.DataTypes;

class Point
{
    int x;
    int y;
}
public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        Point p1 = new Point();

        p1.x = 10;
        p1.y = 20;
 
        Point p2 = p1;
 
        p2.x = 30;
 
        System.out.println(p1.x);
        System.out.println(p2.x);
    }
    /*
    If we uncomment this block and comment out the above main block then we can see the default value of non-primitive data type. Default value is 0.
    public static void main(String[] args) 
    { 
       Point p1 = new Point();

       

       System.out.println(p1.x);
       System.out.println(p1.y);
    }
    */
}
