import java.util.Scanner;

public class PostiveAndNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }

}