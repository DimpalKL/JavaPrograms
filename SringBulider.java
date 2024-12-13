import java.util.Scanner;

public class SringBulider {
    public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            StringBuilder sb=new StringBuilder();
            System.out.println("Enter a string :");
            String userinput=s.next();
            while(!userinput.equalsIgnoreCase("exit"))
            {
                sb.append(userinput).append("\n");
                System.out.println("Enter another string");
                userinput=s.next();
            }
            String result=sb.toString();
            System.out.println("Concatenated String");
            System.out.println(result);
        }
    }


