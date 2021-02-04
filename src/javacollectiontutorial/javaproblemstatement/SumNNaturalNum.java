package javacollectiontutorial.javaproblemstatement;

import java.util.Scanner;

public class SumNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Literal");
        }
        System.out.println((n*(n+1)/2));
    }
}
