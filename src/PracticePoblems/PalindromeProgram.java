package PracticePoblems;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();

        checkPalindrome(str);
    }
    static void checkPalindrome(String input) {
        boolean result = true;
        int n = input.length();

        for (int i = 0; i < n/2; i++) {
            if ( input.charAt(i) != input.charAt(n - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println("The " + input + " is palindrome " + result);
    }
}
