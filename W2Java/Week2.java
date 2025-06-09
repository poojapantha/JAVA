//write a java program that converts an amount in USD to INR. Take the amount in USD as input. Use a conversion rate (1 USD = 83 INR).

public class Week2 {
    public static void main(String[] args) {
        // Conversion rate
        double conversionRate = 83.0;

        // Amount in USD
        double amountInUSD = 100.0; // Example amount

        // Convert to INR
        double amountInINR = amountInUSD * conversionRate;

        // Print the result
        System.out.println(amountInUSD + " USD is equal to " + amountInINR + " INR.");

    }

}

