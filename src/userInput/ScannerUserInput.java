package userInput;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        System.out.println(x);
//
//        double myDouble = sc.nextDouble();
//        System.out.println(myDouble);

        String myString = sc.nextLine();
        System.out.println(myString);
    }
}
