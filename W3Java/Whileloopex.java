public class Whileloopex{
  public static void main(String[] args) {
      int number = 3456; //18
      int sum = 0;
      String reverse = "";


      while(number !=0){
        int digit = number % 10;
        sum += digit;
        reverse += digit;
        number = number/10;
      }
      System.out.println("sum="+ sum);
      System.out.println("reverse number="+reverse);
  }
}