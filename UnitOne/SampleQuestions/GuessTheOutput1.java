package UnitOne.SampleQuestions;

public class GuessTheOutput1 {
    public static void main(String[] args) {
        Integer x1=400, x2=400;
        if(x1==x2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }

    }
}
//Output: Not Same
//Reason: x1 and x2 are objects and both are different objects
//Note: for smaller values it might give output as same because java cache some literals.
//For smaller values it refers to the same literal instead of creating new. So try out with larger values.