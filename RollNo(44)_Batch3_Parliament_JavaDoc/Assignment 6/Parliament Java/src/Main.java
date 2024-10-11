import Parliament.*;

import java.util.Scanner;

/**
 * The main class for managing and displaying information about the Parliament of India.
 * Provides a menu-driven interface for adding members to the Rajya Sabha, Lok Sabha,
 * setting the President of India, and displaying the details of the Parliament.
 *
 * Author: Shreyash Parsekar
 * Roll No: 45
 * Title: Parliament Of India
 * Date: 23/07/2024
 * Batch-3
 * MCA-Part-1
 */
public class Main {
    /**
     * The entry point of the application. Provides a menu-driven interface
     * to interact with the Parliament of India system.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        // Creating members of President, Rajya Sabha and Lok Sabha
        RajyaSabha rajyaSabha = new RajyaSabha();
        LokSabha lokSabha = new LokSabha();
        PresidentOfIndia president = new PresidentOfIndia(null);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a member to Rajya Sabha");
            System.out.println("2. Add a member to Lok Sabha");
            System.out.println("3. Add President");
            System.out.println("4. Show Parliament Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Member Name: ");
                    String nameRajyaSabha = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String positionRajyaSabha = scanner.nextLine();
                    System.out.print("Enter Party: ");
                    String partyRajyaSabha = scanner.nextLine();
                    rajyaSabha.addMember(new MemberOfParliament(nameRajyaSabha, positionRajyaSabha, partyRajyaSabha));
                    System.out.println("Member added to Rajya Sabha.");
                    break;

                case 2:
                    System.out.print("Enter Member Name: ");
                    String nameLokSabha = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String positionLokSabha = scanner.nextLine();
                    System.out.print("Enter Party: ");
                    String partyLokSabha = scanner.nextLine();
                    lokSabha.addMember(new MemberOfParliament(nameLokSabha, positionLokSabha, partyLokSabha));
                    System.out.println("Member added to Lok Sabha.");
                    break;

                case 3:
                    System.out.println("Enter President Name ");
                    String namePresident = scanner.nextLine();
                    president = new PresidentOfIndia(namePresident);
                    break;

                case 4:
                    // Creating the Parliament of India
                    ParliamentOfIndia parliament = new ParliamentOfIndia(president, rajyaSabha, lokSabha);
                    if (rajyaSabha.members.isEmpty() && lokSabha.members.isEmpty()) {
                        System.out.println("Please Add Members to Lok Sabha & Rajya Sabha! ");
                    } else {
                        System.out.println(parliament.toString());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
