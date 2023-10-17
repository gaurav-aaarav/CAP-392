import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Action 1");
            System.out.println("2. Action 2");
            System.out.println("3. Action 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Performing Action 1");
            } else if (choice == 2) {
                System.out.println("Performing Action 2");
            } else if (choice == 3) {
                System.out.println("Performing Action 3");
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
