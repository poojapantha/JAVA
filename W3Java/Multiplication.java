//write a java program to print the mutiplication table of a given number upto 10 using while loop.

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
            i++;
            }
            }
    }