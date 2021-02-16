package PracticePoblems;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int result = sumNaturalNum(n);

        System.out.println("The sum of " + n + " natural number is " + result);
    }

    static int sumNaturalNum(int n) {
        return n*(n+1)/2;
    }
}
