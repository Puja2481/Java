package UnitOne.Variables;
/**
 * In this program we have created a "LocalVariables_StudentDetails" class where we have defined a function StudentAge() 
 * inside that StudentAge() we have initilised age with 0 (because it's a local variable and needs initialization) then some manipulations
 * In main method in order to use that local variable we have to create an object of "LocalVariables_StudentDetails" class 
 * and then calling the function StudentAge().
 * Reason for creating object and not using directly: Variable scope is limited to it's block.
 */

public class LocalVariables_StudentDetails {
    public void StudentAge(){
        int age=0; //local variable
        age = age+5;
        System.out.println("Student age is : " + age);
    }
    public static void main(String[] args) {
        LocalVariables_StudentDetails obj = new LocalVariables_StudentDetails();
        obj.StudentAge();
    }
}


/* 
public class LocalVariables_StudentDetails {
    public void StudentAge(){
        int age=0;
        age = age+5;
        System.out.println("Student age is : " + age);
    }
    public static void main(String[] args) {
        //using local variable age outside it's scope
        System.out.println("Student age is : " + age);
    }
}
*/

/* Output: error: cannot find symbol
 " + age);

Reason: If we use the variable age outside StudentAge() function, the compiler will produce an error 
*/