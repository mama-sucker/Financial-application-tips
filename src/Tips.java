// Module 2: Excercise 2.6 
// By Addison Roy

//Imports
import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        System.out.println("Tips Calculator!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total amount charged: $");
        double amount = scanner.nextDouble();

        System.out.print("Insert your tip percent: ");
        double tipPercentage = scanner.nextDouble();

        double tip = amount * (tipPercentage / 100);
        double total = amount + tip;

        System.out.printf("Tip amount: $%.2f%n", tip);
        System.out.printf("Total after tip: $%.2f%n", total);

        scanner.close();
    }
}
