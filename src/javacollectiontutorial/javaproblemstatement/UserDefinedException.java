package javacollectiontutorial.javaproblemstatement;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

class InvalidBalanceException extends UserDefinedException {
    public InvalidBalanceException (String message) {
        super(message);
    }
}

public class UserDefinedException {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int balance;
            balance = sc.nextInt();
            updateBalance(balance);
        }catch (InvalidBalanceException err) {
            System.out.println("Invalid exception occurred");
            err.printStackTrace();
        } catch (NumberFormatException err) {
            System.out.println(err.getMessage());
        }
    }
    public static void updateBalance(int number) throws InvalidBalanceException {

        if ( number < 0) {
            throw (new InvalidBalanceException("Zero balance is not allowed in this bank"));
        }
        System.out.println("No exception occurred in updateBalance()");
    }

}
