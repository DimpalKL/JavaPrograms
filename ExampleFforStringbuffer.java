import java.util.Scanner;

public class ExampleFforStringbuffer {
    @SuppressWarnings("all")

        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            StringBuffer sb=new StringBuffer("Hello world");
            int length=sb.length();
            System.out.println(length);
            int capacity= sb.capacity();
            System.out.println(capacity);

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



