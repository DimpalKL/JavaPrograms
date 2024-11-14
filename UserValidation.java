import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userID = 101;
        String password = "User@123";
        System.out.println("Enter User ID: ");
        int enteredUserid = scanner.nextInt();
        if(enteredUserid == userID) {
            System.out.println("Enter your password");
            scanner.nextLine();
            String enteredPass = scanner.nextLine();
            if(password.equalsIgnoreCase(enteredPass)) {
                System.out.println("Login Succesfull");
            }
            else {
                System.out.println("Wrong password!,Login Unsuccesfull");
            }
        }
        else {
            System.out.println("Invalid UserID");
        }


    }
}
