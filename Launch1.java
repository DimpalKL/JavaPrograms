import java.util.Scanner;

abstract class Shape1{
    float  area;
    abstract void acceptInput();
    abstract void calArea();
    void dispArea()
    {
        System.out.println(area);
    }
}
class Rectangle extends Shape1{
    float length ,width;
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length= sc.nextFloat();
        System.out.println("Enter the width of the rectangle");
        width=sc.nextFloat();
    }
    void calArea(){
        area=length*width;
    }
}
public class Launch1 {
    void permit(Shape1 ref) {
        ref.acceptInput();
        ref.calArea();
        ref.dispArea();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Launch1 l = new Launch1();
        l.permit(rectangle);
    }
}


























