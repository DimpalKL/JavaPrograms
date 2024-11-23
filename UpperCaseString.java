import java.util.Scanner;

public class UpperCaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.next();
        System.out.println("Enter your choice: ");
        System.out.println("1.Convert to UpperCase\n2.Convert to LowerCase");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println(str.toUpperCase());
                break;
            case 2:
                System.out.println(str.toLowerCase());
                break;
            default:
                System.out.println("Enter the correct choice!!");
                break;
        }
    }
}
