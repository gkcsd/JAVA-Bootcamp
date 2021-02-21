package javacollectiontutorialPrograms.javaproblemstatement;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int itemNum;

        System.out.println("Enter The Length Of The Array: ");
        itemNum = in.nextInt();

        int items[] = new int[itemNum];

        if (itemNum > 0) {
            System.out.println("Enter The Array Elements: ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = in.nextInt();
            }
        }

        System.out.print("The Values are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                System.out.print(items[0]);
            } else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.print("]");
        in.close();
    }
}
