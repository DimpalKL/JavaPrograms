class Plane  //Parent class
{
    void takeoff()
    {
        System.out.println("Plane is taking off");
    }
    void fly()
    {
        System.out.println("Plane is flying");
    }
    void land()
    {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane //child class
{
    void fly()//overridden method
    {
        System.out.println("Plane is flying at low heights");
    }
    void carryCargo()//Specialized method
    {
        System.out.println("Plane is carrying cargo");
    }
}
 class Main1 {

    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.carryCargo();
        Plane p = new Plane();
        p.fly();

    }

}