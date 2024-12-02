class Car{
    private String name;
    private int mileage;
    private int cost;
    //setter method
    public void SetData(String x,int y,int z)
    {
        name=x;
        mileage=y;
        cost=z;
    }
    public String getName(){
        return name;
    }
    public int getMileage(){
        return mileage;
    }
    public int getCost(){
        return cost;
    }

}

 class ExampleForEncapsulation {
    public static void main(String[] args) {
        Car c=new Car();
        c.SetData("BMW",10,7000000);
        System.out.println(c.getName());
        System.out.println(c.getMileage());
        System.out.println(c.getCost());
    }
}