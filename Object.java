class Object
{
    Object()
    {

    }
}

class Test2 extends Object
{
    int x ,y ;
    Test2()
    {
        super();
        x = 100;
        y = 200;
    }
//    Test2(int x , int y)
//    {
//        this.x=x;
//        this.y=y;
//    }

}
class Test0 extends Test2
{
    int a , b;
    Test0()
    {
        super();
        a = 300;
        b = 400;
    }
    Test0(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
 class Test1 {

    public static void main(String[] args) {

        Test0 t = new Test0();
        t.display();
        Test0 t0 = new Test0(10,50);
        t0.display();

    }

}