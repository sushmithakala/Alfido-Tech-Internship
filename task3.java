import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList2
        ArrayList<String> students = new ArrayList<>();

        // HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // HashSet
        HashSet<String> departments = new HashSet<>();

        try {

            System.out.print("How many students do you want to add? ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                System.out.println("\nStudent " + (i + 1));

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                // Custom Exception
                if (age < 18) {
                    throw new InvalidAgeException("Age must be 18 or above.");
                }

                students.add(name);
                studentMap.put(roll, name);
                departments.add(dept);
            }

            System.out.println("\n===== Student List (ArrayList) =====");
            for (String s : students) {
                System.out.println(s);
            }

            System.out.println("\n===== Roll Number & Name (HashMap) =====");
            for (Integer roll : studentMap.keySet()) {
                System.out.println(roll + " -> " + studentMap.get(roll));
            }

            System.out.println("\n===== Departments (HashSet) =====");
            for (String dept : departments) {
                System.out.println(dept);
            }

        }

        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Exception: Invalid Input!");
        }

        finally {
            sc.close();
            System.out.println("\nProgram Ended Successfully.");
        }

    }
}
