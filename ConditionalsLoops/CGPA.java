// To calculate CGPA (Cumulative Grade Point Average) in Java, you need to know the grades and credit hours for each course. The formula to calculate CGPA is:

// CGPA = (Σ (Grade Points * Credit Hours)) / (Σ Credit Hours)

// Here's a Java program that calculates CGPA based on user input:
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        
        double totalCreditPoints = 0.0;
        double totalCreditHours = 0.0;
        
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");
            
            System.out.print("Enter Grade Points (0-4): ");
            double gradePoints = scanner.nextDouble();
            
            System.out.print("Enter Credit Hours: ");
            double creditHours = scanner.nextDouble();
            
            totalCreditPoints += gradePoints * creditHours;
            totalCreditHours += creditHours;
        }
        
        double cgpa = totalCreditPoints / totalCreditHours;
        
        System.out.println("Your CGPA is: " + cgpa);
        
        scanner.close();
    }
}