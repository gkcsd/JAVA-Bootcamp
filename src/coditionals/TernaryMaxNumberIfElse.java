package coditionals;

public class TernaryMaxNumberIfElse {
    public static void main(String[] args) {
        int a = 13, b = 18, c = 4;
        int result = a > b ? a > c ? a : c  :  b > c ? b : c;

        System.out.println("The max number is " + result);
    }
}
