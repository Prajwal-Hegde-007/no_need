

import java.util.Scanner;

class Student {
    String name;
    int age;
    String grade;

    // Constructor to initialize student details
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting student details from the user
        System.out.println("Enter student details");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine();  // To consume the newline character after age input

        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        // Creating Student object with the entered details
        Student student = new Student(name, age, grade);

        // Displaying student details
        System.out.println("\nStudent Details Entered:");
        student.displayDetails();

        scanner.close();
    }
}
