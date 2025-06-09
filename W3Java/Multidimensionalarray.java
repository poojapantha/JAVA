public class Multidimensionalarray{
  public static void main(String[] args) {
      int[][] numbers = {{1,2,3,4}, {5,6,7},{8,9,10}};
      System.out.println(numbers[1][0]);

      for (int[] values:numbers){
            for (int val:values) {
            System.out.println("val = "+ val);{}
          
      }
  }
}
}