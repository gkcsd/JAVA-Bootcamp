package oops;

class Cat {
    boolean isFur;
    String breed,color;
    int legs, eyes;

    public void walk() {
        System.out.println("Cat can walk");
    }
    public void eat() {
        System.out.println("Cat can eat");
    }
    public void description() {
        System.out.println("My cat has " + legs + " legs and " + eyes + " eyes");
    }
}

class Dog {
    String breed, name;

    public void jumped() {
        System.out.println("My dog " + name + " jumped");
    }
    public void description() {
        System.out.println("My dog name is " + name + " & its breed is " + breed);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.legs = 3;
        cat1.eyes = 2;

        cat2.legs = 4;
        cat2.eyes = 1;

        cat1.description();
        cat2.description();

        Dog husky = new Dog();
        Dog poodle = new Dog();

        husky.name = "Remo";
        husky.breed = "Husky";
        husky.jumped();
        husky.description();

        poodle.name = "Demo";
        poodle.breed = "Poodle";
        poodle.jumped();
        poodle.description();

//        cat1.walk();
//        cat2.eat();
    }
}
