public class Demo1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1.empty representation of a string objects
        String s=new String();
        System.out.println(s);
        //2.passing set of characters
        String s1=new String("Dimpal");
        System.out.println(s1);
        //3.coverting char[]into a string object
        char[]c={'j','a','v','a'};
        String s2=new String(c);
        System.out.println(s2);
    }
}
