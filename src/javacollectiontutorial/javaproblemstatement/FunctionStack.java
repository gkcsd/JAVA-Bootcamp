package javacollectiontutorial.javaproblemstatement;

import java.math.*;
import java.io.*;
import java.util.*;


public class FunctionStack
{
    public static void main(String[] args)throws IOException
    {

        System.out.println("Main Begins");

        fun1();

        System.out.println("Main Ends");

    }

    public static void fun1()
    {
        System.out.println("fun1 Begins");

        fun2();

        System.out.println("fun1 Ends");
    }

    public static void fun2()
    {
        System.out.println("Inside fun2");
    }
}

