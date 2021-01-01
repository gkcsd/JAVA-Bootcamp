package coditionals;

public class TernaryIfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        int maxOfBothNumber = 0;

        maxOfBothNumber = a > b ? a : b;

        System.out.println("Max of both number is " + maxOfBothNumber);
    }
}
