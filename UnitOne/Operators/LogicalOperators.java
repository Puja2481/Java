
import java.io.IOException;
import java.util.Scanner;
/*
* Logical Operators : These operators are used to perform "logical AND" and "logical OR" operations, i.e., the function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is that the second condition is not evaluated if the first one is false, i.e., it has short-circuiting effect. It is used extensively to test for several conditions for making a decision. Conditional operators are:
* && , Logical AND : returns true when both conditions are true.
* || , Logical OR : returns true if at least one condition is true. 
*/
public class LogicalOperators {
    public static void main(String[] args) throws IOException {
        String x = "Sher";
        String y = "Locked";

        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Enter username:");
            String uuid = s.next();
            System.out.print("Enter password:");
            String upwd = s.next();
    
            // Check if user-name and password match or not.
            if ((uuid.equals(x) && upwd.equals(y)) || 
                    (uuid.equals(y) && upwd.equals(x))) {
                System.out.println("Welcome user.");
            } else {
                System.out.println("Wrong uid or password");
            }   
        }
        finally{
            s.close();
        }
    
    }

}
