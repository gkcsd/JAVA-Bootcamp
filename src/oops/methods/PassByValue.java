package oops.methods;

public class PassByValue {
    public static void main(String[] args) {
        int c = 10;
        int d = 20;

        swap(c,d);

        System.out.println(c + " " + d);

        // This is for class..

        Dog x = new Dog();
        x.legs = 3;
        Dog y = new Dog();
        y.legs = 4;

        System.out.println(x.legs + " " + y.legs);

        // This is for changing the class content but it is pass by value itself..

        Dog z = new Dog();
        z.legs = 5;

        changeValue(z);

        System.out.println(z.legs);
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Dog a, Dog b) {
        Dog temp = a;
        a = b;
        b = temp;
    }
    static void changeValue(Dog dog) {
        dog.legs = 6;
    }
}

class Dog {
    int legs;
}
