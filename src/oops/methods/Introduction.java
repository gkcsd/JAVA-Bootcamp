package oops.methods;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        float thirdNum = sc.nextFloat();
        float fourNum = sc.nextFloat();

        int result1 = maxOfNum(firstNum, secondNum);
        float result2 = maxOfNum(thirdNum, fourNum);

        sayGreet();
        System.out.println("The greatest the number is " + result1);
        System.out.println();
        sayGreet();
        System.out.println("The greatest the number is " + result2);
    }

    static int maxOfNum (int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static float maxOfNum (float c, float d) {
        if (c > d) {
            return c;
        } else {
            return d;
        }
    }

    static void sayGreet() {
        System.out.println("Hi");
        System.out.println("This is the greeting from us");
    }

}


