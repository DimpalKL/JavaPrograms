import java.util.Scanner;
interface  Calculator{
    void add();
    void sub();
}
class  MyCalculator1 implements Calculator{
    public void add()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public void sub() {
        int a=10;
        int b=5;
        int c=a-b;
        System.out.println(c);
    }
}
class MyCalculator2 implements Calculator
{
    public void add()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int c=a+b;
        System.out.println(c);
    }
    public void sub()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int c=a-b;
        System.out.println(c);
    }
}
class MyCalculator3 implements Calculator
{
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("second number is zero");
        } else {
            int c = a + b;
            System.out.println(c);
        }
    }
        public void sub()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the first number");
            int a=sc.nextInt();
            System.out.println("Enter the second number");
            int b= sc.nextInt();
            if(b==0)
            {
                System.out.println("second number is zero");
            }
            else {
                int c=a-b;
                System.out.println(c);
            }
        }
}
class ExampleForInterface {
    public static void main(String[] args) {
        {
            MyCalculator1 m1 = new MyCalculator1();
            MyCalculator2 m2 = new MyCalculator2();
            MyCalculator3 m3 = new MyCalculator3();
            m1.add();
            m1.sub();
            m2.add();
            m2.sub();
            m3.add();
            m3.sub();
        }
    }
}
