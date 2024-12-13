import java.util.Scanner;

abstract class Shape{
    @SuppressWarnings("all")
    float area;
    abstract void acceptInput();
    abstract void calArea();
    void dispArea()
    {
        System.out.println(area);
    }
}
class Square extends Shape{
    float side;
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the side");
        side= sc.nextFloat();
    }
    void calArea(){
        area=side*side;
    }
}
public class Launch
{
    void permit(Shape ref){
        ref.acceptInput();
        ref.calArea();
        ref.dispArea();
    }
    public static void main(String[] args) {
        Square s= new Square();
        Launch l=new Launch() ;
        l.permit(s);
    }
}
