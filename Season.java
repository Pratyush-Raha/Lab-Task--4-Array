import java.util.Scanner;// Import Scanner class for user input
public class Season {// Define the class
    public static void main(String[] args) {// Main method 
        Scanner scanner = new Scanner(System.in);// Create Scanner object for input
        // Prompt user to enter a month number
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
   // Using switch-case to determine the season based on the month number
        switch (month) {
            case 1, 2:  
                System.out.println("Summer (Grishmo)");  // January & February
                break;
            case 3, 4:  
                System.out.println("Monsoon (Borsha)");  // March & April
                break;
            case 5, 6:  
                System.out.println("Autumn (Shorot)");  // May & June
                break;
            case 7, 8:  
                System.out.println("Late Autumn (Hemonto)");  // July & August
                break;
            case 9, 10:  
                System.out.println("Winter (Sheet)");  // September & October
                break;
            case 11, 12:  
                System.out.println("Spring (Boshonto)");  // November & December
                break;
            default:  
                System.out.println("Invalid month number.");  // For invalid inputs
        }
    }
}