import java.util.Scanner;

public class ExampleForStingbulider {
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            StringBuilder sb=new StringBuilder("Hello world");
            sb.replace(7,12,"everyone");
            System.out.println(sb);
            int length=sb.length();
            System.out.println(length);
            sb.ensureCapacity(34);
            sb.trimToSize();

            System.out.println("Enter a string :");
            String userinput=s.next();
            while(!userinput.equalsIgnoreCase("exit"))
            {
                sb.append(userinput).append("\n");
                System.out.println("Enter another string");
                userinput=s.next();
            }
            String result=sb.toString();
            System.out.println("Concatenated String:");
            System.out.println(result);
        }
    }




