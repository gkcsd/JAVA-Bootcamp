package problems;

import java.util.Scanner;

//This is fibonacci program using method..

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        fiboFunc(n);
    }
    public static void fiboFunc(int n) {
        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i < n-2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
