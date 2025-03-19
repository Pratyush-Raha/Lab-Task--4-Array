import java.util.Scanner;// Import Scanner to take user input
public class Factorial {// Define the class
    public static void main(String[] args){//Main method
       Scanner input= new Scanner (System.in);// Set up Scanner for processing input data
       int num;// Variable to store the user's input number
       float Fact =1;// Variable to store factorial result
       // Ask the user to enter a number
       System.out.print("Enter the Number:");
       num = input.nextInt();
       // Loop to calculate factorial (num * (num-1) * (num-2) * ... * 1)
       for (int i=num;i>=1;i--) {
         Fact= Fact *i;
       }
       // Show the result
       System.out.print("The Answer is: "+Fact);

      }
}
