import java.util.Scanner;

public class Apiresponsehandle {
    public static void main(String[] args) {
        // Prompt user for input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for input
            System.out.print("Enter HTTP status code: ");
            int statusCode = scanner.nextInt();
            
            // Handle HTTP status codes using switch
            switch (statusCode) {
                case 200 -> System.out.println("OK");
                case 404 -> System.out.println("Not Found");
                case 500 -> System.out.println("Internal Server Error");
                default -> System.out.println("Unknown status");
            }
        }
    }
}