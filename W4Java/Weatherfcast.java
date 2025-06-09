import java.util.Scanner;
public class Weatherfcast {
    // Method to convert temperature
    public static double convertTemp(double temp, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            return (temp * 9 / 5) + 32; // C to F
        } else if (unit.equalsIgnoreCase("F")) {
            return (temp - 32) * 5 / 9; // F to C
        } else {
            return temp; // If wrong unit
        }
    }
    // Method to give weather advice
    public static String getWeatherAdvice(double temp, String condition) {
        String advice = " ";
        if (temp < 10) {
            advice = "Wear warm clothes.";
        } else if (temp < 20) {
            advice = "Wear a light jacket.";
        } else {
            advice = "Wear light clothes.";
        }

        if (condition.equalsIgnoreCase("rainy")) {
            advice += " Carry an umbrella!";
        } else if (condition.equalsIgnoreCase("sunny")) {
            advice += " Wear sunglasses!";
        }
        return advice;
    }
    public static void main(String[] args) {
        // Get temperature
        try (Scanner input = new Scanner(System.in)) {
            // Get temperature
            System.out.print("Enter temperature: ");
            double temp = input.nextDouble();
            
            // Get unit
            System.out.print("Enter unit (C or F): ");
            String unit = input.next();
            
            // Convert temperature
            double converted = convertTemp(temp, unit);
            if (unit.equalsIgnoreCase("C")) {
                System.out.println("Temperature in Fahrenheit: " + converted);
            } else {
                System.out.println("Temperature in Celsius: " + converted);
            }
            // Get weather condition
            System.out.print("Enter weather condition (sunny, rainy, etc.): ");
            input.nextLine(); // to consume newline
            String condition = input.nextLine();
            // Give advice
            String advice = getWeatherAdvice(temp, condition);
            System.out.println("Advice: " + advice);
        }
    }
}