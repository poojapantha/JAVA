public class Countarray {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 2, 4, 2, 5 };
        int count = 0;
        for (int value : num) {
            if (value == 2) {
                count++;
            }
        }
        System.out.println("Counter: " + count);

    }

}