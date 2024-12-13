import java.util.Scanner;

public class ExampleForArray{
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //one-dimensional array
        int age[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<age.length;i++)
        {
            System.out.println("Enter the age of student:" + i);
            age[i]=s.nextInt();
        }
        System.out.println();

    }
}
