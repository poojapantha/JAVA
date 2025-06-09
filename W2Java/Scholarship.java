public class Scholarship {
    public static void main(String[] args) {
        double gpa = 3.4;

        if (gpa >= 3.5) {
            System.out.println("Eligible for full scholarship.");
        } else if (gpa >= 3.0 && gpa <= 3.49) {
            System.out.println("Eligible for partial scholarship.");
        } else {
            System.out.println("Not eligible for scholarship.");
        }
    }
}