package oops.polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Dog d = new Dog();

        Pet p = d;
        Animal a = d;

        d.walk();
        p.walk(); // it is runtime polymorphism..

        greeting("Good Morning", 5);
    }

    //It is called compiler time polymorphism..
    public static void greeting() {
        System.out.println("Hii, How are you all ?");
    }

    public static void greeting(String s) {
        System.out.println("Hii " + s);
    }

    public static void greeting(String s, int n) {
        for(int i = 0; i <= n; i++) {
            System.out.println(s);
        }
    }
}
