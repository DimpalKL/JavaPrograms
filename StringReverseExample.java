import java.util.Scanner;

public class StringReverseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);

    }
}
