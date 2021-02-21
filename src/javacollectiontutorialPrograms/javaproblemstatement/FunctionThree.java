package javacollectiontutorialPrograms.javaproblemstatement;

import java.io.*;

class Poi
{
    int x;
    int y;
}
public class FunctionThree
{
    public static void main(String[] args)throws IOException
    {

        Poi p = new Poi();

        p.x = 5; p.y = 10;

        fun(p);

        System.out.println(p.x +" "+ p.y);
    }

    public static void fun(Poi p)
    {
        p.x = 10; p.y = 10;
    }


}

