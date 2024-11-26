public class MethodType3 {
    int Add()
    {
        int a = 10,b = 20;
        return a+b;
    }
}
class Addition3
{
    public static void main(String[] args) {
        MethodType3 ref = new MethodType3();
        int res = ref.Add();
        System.out.println(res);

    }
}
