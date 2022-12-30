package UnitOne.SampleQuestions;
/*
* Change the case of the character entered. (using operators only).
*/
public class Problem1 {
    public static void main(String[] args) {
        char ch1 = 'p', ch2 = 'P';
        
        System.out.println("Character p changed to: " + (char)((ch1 >= 'a' && ch1 <= 'z') ? (ch1 - 'a' + 'A') : (ch1 - 'A' + 'a')) ); //Character p changed to: P
        System.out.println("Character P changed to: " + (char)((ch2 >= 'a' && ch2 <= 'z') ? (ch2 - 'a' + 'A') : (ch2 - 'A' + 'a')) ); //Character P changed to: p

    }
}
