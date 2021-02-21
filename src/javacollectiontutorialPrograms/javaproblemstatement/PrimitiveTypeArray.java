package javacollectiontutorialPrograms.javaproblemstatement;

import java.util.Scanner;

public class PrimitiveTypeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] b = new float[4];

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextFloat();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
