package oops;

public class StaticBlock {

    static {
        System.out.println("Static block one");
    }
    static {
        System.out.println("Static block two");
    }
    public static void main(String[] args) {
        System.out.println("Inside main Method");
    }
    static {
        System.out.println("Static block three");
    }
}
