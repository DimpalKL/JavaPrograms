import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("Maximum number is : " + num1);
        }
        else {
            System.out.println("Maximum number is : " + num2);
        }
    }
}
