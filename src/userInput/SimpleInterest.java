package userInput;

import java.awt.*;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();

        float simpleInterest = principal * rate * time / 100;

        System.out.println("The simple Interest is: " + simpleInterest);
    }
}
