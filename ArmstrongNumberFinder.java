import java.util.Scanner;

public class ArmstrongNumberFinder {

    // Method to print Armstrong numbers in the given range
    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    private static boolean isArmstrong(int num) {
        int original = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;

            // Calculate cube of the digit using a loop
            int cube = 1;
            for (int i = 0; i < 3; i++) {
                cube *= digit;
            }

            sum += cube;
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Call the method to print Armstrong numbers
        printArmstrongNumber(start, end);

        scanner.close();
    }
}

































