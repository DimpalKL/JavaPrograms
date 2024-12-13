abstract  class Plane
{
    abstract  void  takeoff();
    abstract void fly();
    abstract void land();
}
class CargoPlane extends Plane{
    void takeoff()
    {
        System.out.println("CargoPlane is taking off");
    }
    void fly()
    {
        System.out.println("CargoPlane fly at high heights");
    }
    void land()
    {
        System.out.println("CargoPlane is landing");
    }
}
class Passenger extends Plane
{
    void takeoff()
    {
        System.out.println("PassengerPlane is taking off");
    }
    void fly()
    {
        System.out.println("PassengerPlane fly at medium heights");
    }
    void land()
    {
        System.out.println("CargoPlane is landing");
    }

}
class FighterPlane extends Plane{
    void takeoff()
    {
        System.out.println("FighterPlane is taking off");
    }
    void fly()
    {
        System.out.println("FighterPlane fly at low heights");
    }
    void land()
    {
        System.out.println("FighterPlane is landing");
    }
}
public class Solution {
    void permit(Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }

    public static void main(String[] args) {
        CargoPlane c= new CargoPlane();
        Passenger p =new Passenger();
        FighterPlane f=new FighterPlane();
        Solution s=new Solution();
        s.permit(c);
        System.out.println("===================");
        s.permit(p);
        System.out.println("====================");
        s.permit(f);
    }
}
