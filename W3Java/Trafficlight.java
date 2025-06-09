public class Trafficlight {
    public static void main(String[] args) {
        String signal = "yellow";

        switch (signal) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Slow down");
            case "green" -> System.out.println("Go");
            default -> System.out.println("Invalid signal");
        }
    }
}