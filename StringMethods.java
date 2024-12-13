public class StringMethods {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String s = "Software Developer";
        System.out.println(s.length());
        System.out.println("=============");
        System.out.println(s.toUpperCase());
        System.out.println("=============");
        System.out.println(s.toLowerCase());
        System.out.println("=============");
        System.out.println(s.contains(s));
        System.out.println("=============");
        System.out.println(s.startsWith("d"));
        System.out.println("=============");
        System.out.println(s.concat(" in infosys "));


    }
}
