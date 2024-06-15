import java.util.Scanner;

public class UserRegistrationPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to User Registration Page");
        System.out.println("---------------------------------");
        
        // Collect user input
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        
        // Simulating submission - in a real application, you would process this data
        System.out.println("\nProcessing Registration...");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Registration Successful!");
        
        scanner.close();
    }
}
