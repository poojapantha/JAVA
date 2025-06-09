
import java.util.Scanner;

public class Classvariable {
    public static void main(String[] args) {
        // datatype variableName = value
        int newValue = 9;
        float price = 7.6f;
        double newPrice = 5.2;
        long largeValue = 1000000000L;
        char letter = 'a'; // primitive
        String name = "pooja"; // non primitive
        System.out.println(newValue);
        System.out.println(price);
        System.out.println(newPrice);
        System.out.println(largeValue);
        System.out.println(letter);
        System.out.println(name);

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:"); 
        int inputValue = sc.nextInt();
        System.out.println("Input value is:" +inputValue); 
         }
}
