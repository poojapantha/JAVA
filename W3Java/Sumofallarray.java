//write a program in java summ of all  to calculate the sum of all the element in array 
//example problem:
//input [10,20,30,40,50]
//output sum:150

public class Sumofallarray {
    public static void main(String[] args) {
        int arr []={10,20,30,40,50};
        int sum= 0;

        for (int value:arr){
        sum += value;
    }
        System.out.println("Sum of all elements in array is: "+sum);



    }
    
}