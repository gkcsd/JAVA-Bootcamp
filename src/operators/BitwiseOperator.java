package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
/*
        5 --> 101
        6 --> 110
        4  == 100

        //or operation

        10 --> 1010
        13 --> 1101
        15  == 1111

        //right shift operator
        1101 >> 0110 >> 0011 >> 0001 >> 0000 >> 0000

 */
        int a = 5;
        int b = 6;

        int c = a & b;
        System.out.println(c);

        int d = 10;
        int e = 13;

        int f = d | e;
        System.out.println(f);

        int g = e >> 1;
        System.out.println(g);


        int h = e << 1;
        System.out.println(h);
    }

}
