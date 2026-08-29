import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int subject3 = sc.nextInt();

        int total = subject1 + subject2 + subject3;

        double average = (double) total / 3;

        boolean passed = subject1 >= 40 && subject2 >= 40 && subject3 >= 40;

        boolean distinction = passed && average >= 75;

        boolean specialAward = passed && average >= 90;

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (passed) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }

        if (distinction) {
            System.out.println("Distinction: YES");
        } else {
            System.out.println("Distinction: NO");
        }

        if (specialAward) {
            System.out.println("Special Award: YES");
        } else {
            System.out.println("Special Award: NO");
        }

        sc.close();
    }
}