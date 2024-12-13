public class ExampleForComparsion {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String s= new String("JAVA");
        String s1=new String("java");
        if(s == s1)
        {
            System.out.println("Both are Equal");
        }
        else {
            System.out.println("Both are not Equal");
        }
    }
}
