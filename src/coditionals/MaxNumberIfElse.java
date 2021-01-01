package coditionals;

public class MaxNumberIfElse {
    public static void main(String[] args) {
        int a = 13, b = 18, c = 4;

        int result = 0;

        if (a > b) {
            if (a > c) {
                result = a;
            } else {
                result = c;
            }
        } else {
            if (b > c) {
                result = b;
            } else {
                result = c;
            }
        }
        System.out.println("The maximum number is " + result);
    }
}
