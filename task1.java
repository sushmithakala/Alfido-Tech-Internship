import java.util.Scanner;sri

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        // User Input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        // Array
        int[] marks = new int[5];

        System.out.println("Enter 5 Subject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Object Creation
        Student student = new Student(name, rollNo, department, marks);

        // Getter
        System.out.println("\nRoll Number using Getter: " + student.getRollNo());

        // Setter
        System.out.print("Enter Updated Department: ");
        sc.nextLine(); // Consume newline
        String newDepartment = sc.nextLine();
        student.setDepartment(newDepartment);

        // Runtime Polymorphism
        Person person = student;
        person.displayDetails();

        sc.close();
    }
}

// Parent Class
class Person {

    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Person Name: " + name);
    }
}

// Child Class
class Student extends Person {

    // Encapsulation
    private int rollNo;
    private String department;
    private int[] marks;

    // Constructor
    public Student(String name, int rollNo, String department, int[] marks) {
        super(name);
        this.rollNo = rollNo;
        this.department = department;
        this.marks = marks;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Polymorphism (Method Overriding)
    @Override
    public void displayDetails() {

        System.out.println("\n========== Student Details ==========");

        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Department : " + department);

        int total = 0;

        System.out.print("Marks      : ");

        // Loop
        for (int mark : marks) {
            System.out.print(mark + " ");
            total += mark;
        }

        double average = (double) total / marks.length;

        System.out.printf("\nAverage    : %.2f\n", average);

        // Condition
        if (average >= 50) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }
    }
}

