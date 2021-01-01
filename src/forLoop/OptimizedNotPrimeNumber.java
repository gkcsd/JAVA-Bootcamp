package forLoop;

import java.util.Scanner;

public class OptimizedNotPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        boolean isPrime = true; // any number having any factor then it belongs to 1 to root n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (n < 2) isPrime = false;

        System.out.println("Is prime " + isPrime);
    }
}
