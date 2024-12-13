import java.util.Scanner;

abstract class Shape2{
    float area;
    abstract void acceptInput();
    abstract void calArea();
    void dispArea()
    {
        System.out.println(area);
    }
}
class Circle extends Shape2{
    float radius;
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius= sc.nextFloat();
    }
    void calArea(){
        area=(float)(Math.PI*radius*radius);
    }
}
public class Launch2
{
    void permit(Shape2 ref){
        ref.acceptInput();
        ref.calArea();
        ref.dispArea();
    }
    public static void main(String[] args) {
        Circle c= new Circle();
        Launch2 l=new Launch2() ;
        l.permit(c);
    }
}
