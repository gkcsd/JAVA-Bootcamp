package PracticePoblems;

import java.util.Scanner;

public class RecursionFactNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int num = sc.nextInt();

        int result  = fact(num);
        System.out.println(result);
    }
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int output = fact(n -1) * n;
        return output;
    }
}
