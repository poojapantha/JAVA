import java.util.Scanner;
public class Fitnesstracker {
    // Calculate calories burned based on steps and weight
    public static double calculateCaloriesBurned(int steps, double weight) {
        double caloriesPerStep = 0.04;
        double standardWeight = 70.0;
        return (steps * weight * caloriesPerStep) / standardWeight;
    }
    // Suggest workout plan based on age and BMI
    public static String suggestWorkoutPlan(int age, double BMI) {
        if (BMI < 18.5) {
            return "Underweight: Focus on strength training and a balanced diet.";
        } else if (BMI >= 18.5 && BMI < 24.9) {
            return "Normal weight: Maintain with cardio and moderate strength training.";
        } else if (BMI >= 25 && BMI < 29.9) {
            return "Overweight: Emphasize cardio workouts and a healthy diet.";
        } else {
            return "Obese: Consult a professional and focus on low-impact cardio and nutrition.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for steps
        System.out.print("Enter number of steps taken: ");
        int steps = scanner.nextInt();

        // Get user input for weight
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        // Calculate calories burned
        double caloriesBurned = calculateCaloriesBurned(steps, weight);
        System.out.printf("Estimated calories burned: %.2f\n", caloriesBurned);

        // Get user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get user input for BMI
        System.out.print("Enter your BMI: ");
        double BMI = scanner.nextDouble();

        // Suggest workout plan based on age and BMI
        String workoutPlan = suggestWorkoutPlan(age, BMI);
        System.out.println("Workout plan suggestion: " + workoutPlan);

        scanner.close();
    }
}