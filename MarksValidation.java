import java.util.Scanner;

public class MarksValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();
        if(marks > 80 && marks <= 100) {
            System.out.println("Distinction");
        }
        else if(marks > 60 && marks <= 80) {
            System.out.println("First Class");
        }
        else if(marks >= 50 && marks < 60)
        {
            System.out.println("Second Class");
        }
        else if(marks >= 35 && marks < 49) {
            System.out.println("Pass");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid Marks");
        }
    }
}
