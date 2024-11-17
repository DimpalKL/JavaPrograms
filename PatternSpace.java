public class PatternSpace {
    public static void main(String[] args) {
//        int rows = 5;

        // Row 1
        for (int i = 0; i < 4; i++) {
            System.out.print("   "); // Spaces for alignment
        }
        System.out.println("*");

        // Row 2
        for (int i = 0; i < 3; i++) {
            System.out.print("   "); // Spaces for alignment
        }
        System.out.println("*     *");

        // Row 3
        for (int i = 0; i < 2; i++) {
            System.out.print("   "); // Spaces for alignment
        }
        System.out.println("*  *  *  *  *");

        // Row 4
        for (int i = 0; i < 3; i++) {
            System.out.print("   "); // Spaces for alignment
        }
        System.out.println("*     *");

        // Row 5
        for (int i = 0; i < 3; i++) {
            System.out.print("   "); // Spaces for alignment
        }
        System.out.println("*  *  *");
    }
}