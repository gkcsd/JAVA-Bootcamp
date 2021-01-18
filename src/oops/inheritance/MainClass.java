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

        //upcasting:
        //          teacher is a person
//        Teacher t = new Teacher();
//        Person p = t;


        //downcasting:
        //          Person may be teacher but it will show the runtime error
//        Person p = new Person();
//        Teacher t = (Teacher) p;

        Teacher t = new Teacher("Garry");

        t.eat();
    }
}
