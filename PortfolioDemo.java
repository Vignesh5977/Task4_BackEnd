import java.util.Scanner;

public class PortfolioDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to My Portfolio");
        System.out.println("I am a passionate developer, and here are some of my projects:\n");
        System.out.println("1. Project 1: Description of Project 1");
        System.out.println("2. Project 2: Description of Project 2");
        System.out.println("3. Project 3: Description of Project 3\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'contact' to get contact information or 'exit' to quit: ");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("contact")) {
                System.out.println("You can contact me at example@email.com");
            } else if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Type 'contact' or 'exit'.");
            }
        }

        scanner.close();
    }
}
