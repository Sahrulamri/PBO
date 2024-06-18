package com.DB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Show Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    InsertData.insert(scanner);
                    break;
                case 2:
                    EditData.edit(scanner);
                    break;
                case 3:
                    DeleteData.delete(scanner);
                    break;
                case 4:
                    ShowData.show();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
