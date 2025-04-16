import java.util.Scanner;

public class SD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of available courses
        String[] courses = {
            "1. Computer Science",
            "2. Mathematics",
            "3. Physics",
            "4. Chemistry",
            "5. Biology"
        };

        System.out.println("Welcome to the Course Selection System!");
        System.out.println("Please choose a course by entering the corresponding number:");
        
        // Display available courses
        for (String course : courses) {
            System.out.println(course);
        }

        // Take input from the student
        int choice = scanner.nextInt();

        // Validate and display selected course
        if (choice >= 1 && choice <= courses.length) {
            System.out.println("You have successfully selected: " + courses[choice - 1].split("\\.")[1].trim());
        } else {
            System.out.println("Invalid choice! Please select a valid course number.");
        }

        scanner.close();
    }
}
