//you are developing an ATM withdrawal sytem. A user has a bank account with a balance of $5000.
//The user wants to withdraw money multiple times.but the ATM should keep asking for 
//withdrawal amount more than the available balnce question to display an error message and ask again.
//Write a java program that continuously allow user to user to withdraw money from their account using a 
//while Loop . the program should be stop if the balance reaches zero. 
import java.util.Scanner;
public class Atmsystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double balance = 5000.0;
        while (true) {
            System.out.println("Available Balance: $" + balance);
            System.out.print("Enter the amount you want to withdraw: $");
            double withdrawalAmount = sc.nextDouble();
            if (withdrawalAmount > balance) { 
                System.out.println("Insufficient balance. Please enter a valid amount."); 
                continue;
                }
                balance -= withdrawalAmount;
                if (balance == 0) {
                    System.out.println("Your account balance is zero. Withdrawal stopped.");
                    break;
                    }
                    }
                    }

    }