import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int sum = 0;
            
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            
            System.out.println("Sum of digits: " + sum);
        }
    }
}