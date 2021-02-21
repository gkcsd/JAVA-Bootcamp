package javacollectiontutorialPrograms.javaproblemstatement;

class NonPriRef {
    int x, y;
}

public class FunctionExample {
    public static void main(String[] args) {
        NonPriRef n = new NonPriRef();
        n.x = 5;
        n.y = 10;

        fun1(n);
        System.out.println(n.x + " " + n.y);
    }

    public static void fun1(NonPriRef n) {
        n = new NonPriRef();
        n.x = 10;
        n.y = 10;
    }
}

