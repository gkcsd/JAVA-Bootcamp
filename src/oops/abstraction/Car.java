package oops.abstraction;

public abstract class Car {
    public abstract void accelerate();

    public abstract void breaking();

    //Concrete method...
    public void Honk() {
        System.out.println("car is Honking");
    }
}
