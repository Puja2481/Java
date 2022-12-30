package UnitOne.Variables;

class Article {

    // static variable salary
    public static double rating;
    public static String name = "Boat Airdopes";
 }
 
 public class StaticVariables_ArticleDemo
 {
      public static void main(String args[]) {
       
       //accessing static variable without object         
       Article.rating = 4.5;
       System.out.println(Article.name + "'s  rating:" + Article.rating);
    }
     
 }

