package oops.inheritance;

public class Singer extends Person{

    public Singer(String name) {
        super(name);
        System.out.println("Inside the Singer constructor");
    }

    public void sing() {
        System.out.println(name +" is singing");
    }

    public void eat() {
        System.out.println("Singer " + name + " is Singing");
    }

    public static void laughing() {
        System.out.println("Singer is laughing");
    }
}
