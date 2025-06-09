public class Arrayexample{
  public static void main(String[] args) {
     int[] numbers= {1,12,3,5,6,7,10};
      int max = 12;
      int min = 1;


      for (int value : numbers){
        if (value <min){
          min = value;
        }
        if (value>max){
          max = value;
        }
      }
      System.out.println("min=" + min);
  System.out.println("max=" + max);
  }
}