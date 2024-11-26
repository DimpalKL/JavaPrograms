public class MethodType4 {

    int c;
    int Add(int x,int y) {
        c = x + y;
        return c;
    }
}
class Addition4 {
    public static void main(String[] args) {
        MethodType4 ref = new MethodType4();
        int a = 10,b = 20;
        int res = ref.Add(a,b);
        System.out.println(res);
    }
}