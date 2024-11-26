public class MethodType2 {
   int c;
   void Add(int x,int y) {
       c = x + y;
       System.out.println(c);
    }
}
class Addition02 {
    public static void main(String[] args) {
        MethodType2 ref = new MethodType2();
        int a = 10, b = 20;
        ref.Add(a,b);
    }
}
