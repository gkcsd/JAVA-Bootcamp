package javacollectiontutorial.javaproblemstatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0;

        System.out.println("Enter The Move: ");
        char move = sc.next().charAt(0);

        switch (move) {
            case 'l':
                x--;
                break;
            case 'r':
                x++;
                break;
            case 'u':
                y++;
                break;
            case 'd':
                y--;
                break;
            default:
                System.out.println("Invalid I/P");
        }
        System.out.println(x + " " + y);
    }
}
