package javacollectiontutorialPrograms.javaproblemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String");

        String s = br.readLine();

        System.out.println("You Entered " + s);

    }
}
