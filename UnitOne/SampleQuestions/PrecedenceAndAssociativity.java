package UnitOne.SampleQuestions;

public class PrecedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 20, b = 10, d = 20, e = 40, f = 30;
        
        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        // prints a+(b/d)
        System.out.println("a+b/d = "+(a + b / d)); //a+b/d = 20

        // if same precendence then associative
        // rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "+(a + b * d - e / f)); //a+b*d-e/f = 219
    }
}
