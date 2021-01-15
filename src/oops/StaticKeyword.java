package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
    public static void main(String[] args) {
//        Person obj = new Person();
//        obj.breed = "hi";
//
//        System.out.println(obj.breed);

//        For class A:

        A objA = new A();
        //A.B objB = objA.new B();
        B objB = objA.new B();

        //A.C objC = new A.C();
        C objC = new A.C();
    }
}
