public class Car {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Car c;
        c = new Car();
        Car c1=new Car();
        System.out.println(c);
        System.out.println(c.toString());
        System.out.println("=============");
        System.out.println(c.hashCode());
        System.out.println("=============");
        System.out.println(c.equals(c1));
    }
}
