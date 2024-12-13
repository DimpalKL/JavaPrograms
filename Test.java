class Animal
{
    String color="white";
}
class Dog extends Animal
{
    String color="Black";

        void printColor()
        {
            System.out.println(color);
            System.out.println(super.color);
        }

    }
    public class Test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printColor();
    }

}
