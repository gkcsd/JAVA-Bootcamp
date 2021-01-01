import java.util.Scanner;

public class DemoAdd {
    public static void main(final String[] args) {
        System.out.println("Enter the number one:");
        final int x = extracted().nextInt();
        System.out.println("Enter the second number:");
        final int y = extracted().nextInt();
        final int z = x + y;
        System.out.println(z);
    }

    private static Scanner extracted() {
        return new Scanner(System.in);
    }
}
