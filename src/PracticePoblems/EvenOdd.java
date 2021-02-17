package PracticePoblems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");

        int n = sc.nextInt();
        arrayNum(n);

    }
    static void arrayNum(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        EvenOddFun(arr);
    }
    static void EvenOddFun(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                System.out.println("This Number is even [ " + arr[i] + " ]");
            } else {
                System.out.println("This number is odd [ " + arr[i] + " ]");
            }
        }
    }
}
