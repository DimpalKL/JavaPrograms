import java.util.Scanner;

//create an array to store the age of students belongs 2 classrooms
public class ExampleForTwoDimension {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int age[][]=new int[2][5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<=age.length-1;i++)//classroom
        {
            for(int j=0;j<=age[i].length-1;j++)//students
            {
                System.out.println("Enter the age of students belongs to classroom" + i + "student");
               age[i][j]= s.nextInt();
            }
        }
    }
}
