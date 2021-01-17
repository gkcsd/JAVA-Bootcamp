package oops.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. Garry";

        t.teach();

        t.walk();

        t.eat();

        System.out.println();

        Singer s = new Singer();
        s.name = "Harry";

        s.sing();

        s.eat();

        s.walk();
    }
}
