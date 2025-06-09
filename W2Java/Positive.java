//Write a java program that checks weather a given number is positive, zero or negative.

public class Positive {
    public static void main(String[] args) {
       int number = 10;

       if(number>0) {
        System.out.println("positive");
       } else if (number<0) {
        System.out.println("Negative");
       } else {
        System.out.println("Zero");
       }
    }
}