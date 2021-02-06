package javacollectiontutorial.javaproblemstatement;

import java.math.*;
import java.io.*;
import java.util.*;

class PointClass
{
    int x;
    int y;
}
public class FunctionFourNewMem
{
    public static void main(String[] args)throws IOException
    {

        PointClass p = new PointClass();

        p.x = 5; p.y = 10;

        fun(p);

        System.out.println(p.x +" "+ p.y);
    }

    public static void fun(PointClass p)
    {
        p = new PointClass();

        p.x = 10; p.y = 10;
    }


}


