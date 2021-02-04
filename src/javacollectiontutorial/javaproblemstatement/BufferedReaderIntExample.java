package javacollectiontutorial.javaproblemstatement;

import java.math.*;
import java.io.*;
import java.util.*;


public class BufferedReaderIntExample
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an Integer");

        int x = Integer.parseInt(br.readLine());

        System.out.println("You Entered " + x);

    }
}


