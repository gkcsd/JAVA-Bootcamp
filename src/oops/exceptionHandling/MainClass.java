package oops.exceptionHandling;

import javax.swing.plaf.multi.MultiTableHeaderUI;

public class MainClass {
    public static void main(String[] args) {

//        try {
//            int a = 5;
//            int b = 0;
//
//            int c = a/b;
//            System.out.println(c);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage() + " , please check the code");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Index should be in range of 0 to size of array");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e + " please check your casting carefully");
//        } finally {
//            System.out.println("Sorry for the inconvenience");
//        }
//
//        System.out.println("This is the outer code");
//        System.out.println("This need to run");

        fun1();

    }
        static void fun1() {
            int a = 5;
            int b = 3;

            int c = a/b;
            System.out.println(c);

            try {
                fun2();
            } catch (Exception e) {
                System.out.println(e.getMessage() + " occurred");
            }

        }

        static void fun2() throws ArrayIndexOutOfBoundsException {
            boolean isDanger = true;
            if (isDanger) {
                throw new ArrayIndexOutOfBoundsException("Something was happened");
            }
        }
}
