package helloWorld;
import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        System.out.println("My name is: " + firstName + " " + lastName);
    }
}
