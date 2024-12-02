record Car1(String name, int mileage, int cost) {
}
 class Car2 {
    public static void main(String[] args) {
        Car1 c = new Car1("BMW", 10, 7000000);
        System.out.println(c.name());
        System.out.println(c.mileage());
        System.out.println(c.cost());
    }
}