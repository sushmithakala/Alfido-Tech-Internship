import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        int[] rolls = new int[100];
        int count = 0;

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    rolls[count] = sc.nextInt();
                    sc.nextLine();

                    count++;

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Students Found.");
                    } else {

                        System.out.println("\nStudent List");

                        for (int i = 0; i < count; i++) {
                            System.out.println("--------------------------------");
                            System.out.println("Student " + (i + 1));
                            System.out.println("Name : " + names[i]);
                            System.out.println("Roll : " + rolls[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (rolls[i] == searchRoll) {

                            System.out.println("Student Found");
                            System.out.println("Name : " + names[i]);
                            System.out.println("Roll : " + rolls[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

        sc.close();
    }
}
