package oops.inheritance;

public class MainClass {
    public static void main(String[] args) {
//        Teacher t = new Teacher();
//        t.name = "Mr. Garry";
//
//        t.teach();
//
//        t.walk();
//
//        t.eat();
//
//        System.out.println();
//
//        Singer s = new Singer();
//        s.name = "Harry";
//
//        s.sing();
//
//        s.eat();
//
//        s.walk();

        System.out.println();

        //upcasting:
        //          teacher is a person
//        Teacher t = new Teacher();
//        Person p = t;


        //downcasting:
        //          Person may be teacher but it will show the runtime error
//        Person p = new Person();
//        Teacher t = (Teacher) p;

        //Simplified Casting:
        Teacher t1 = new Teacher();

        Singer s1 = new Singer();

        Person p = t1;

        Teacher t = (Teacher) p;

        boolean ans = t1 instanceof Teacher;

        System.out.println(t1 instanceof Teacher);
        System.out.println(s1 instanceof Singer);
        System.out.println(t1 instanceof Person);

        System.out.println(t instanceof Teacher);
    }
}
