package oops;


class Vehicle {
    int wheels;
    int headLights;
    String color;

    //it is called default constructor or non-parameterized constructor
    Vehicle() {
        System.out.println("This is default constructor");
    }

    //parameterized constructor..
    Vehicle(int wheels) {
        this.wheels = wheels;
    }

    //Constructor overloading..
    Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
        headLights = 2;
    }
}


public class MySConstructor {
    MySConstructor() {
        System.out.println("The object is created");
    }
    public static void main(String[] args) {

        MySConstructor obj = new MySConstructor();

//        //Non-parametrized constructor..
//        Vehicle car1 = new Vehicle();
//        Vehicle car2 = new Vehicle();
//
//        System.out.println(car1.wheels);
//        System.out.println(car2.wheels);

        //Parameterized constructor..
        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(3);

        System.out.println(car.wheels);
        System.out.println(scooty.wheels);

        //Constructor overloading..
        Vehicle eRikshaw1 = new Vehicle(3,"black");
        Vehicle eRikshaw2 = new Vehicle(4,"mix-black");

        System.out.println(eRikshaw1.wheels + " " + eRikshaw1.color);
        System.out.println(eRikshaw2.wheels + " " + eRikshaw2.color);

        //Default constructor..
        Vehicle dCon = new Vehicle();

    }
}
