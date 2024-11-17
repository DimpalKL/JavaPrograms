public class StarPattern {
    public static void main(String[] args) {
        int n = 3; // Height of the top part

        // Top part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   "); // Print spaces
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*  "); // Print stars
            }
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*  "); // Additional stars after the first one
                }
            }
            System.out.println();
        }
        // Middle part
        for (int i = 0; i < n - 1; i++) {
            System.out.print("   "); // Space for alignment
            System.out.print("*     *");
            System.out.println();
        }
        // Bottom part
        System.out.print("   "); // Alignment for the last line
        System.out.print("*  *  *");
        System.out.println();
    }
}