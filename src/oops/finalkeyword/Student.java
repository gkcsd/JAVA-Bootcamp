package oops.finalkeyword;

public final class Student {
    String name;
    int rollNo;

//    //You can initialize the final variable in empty block
//    {
//        rollNo = 10;
//    }
//
//    //you can initialize the final variable into the static block
//    static {
//        //code is here
//        //int rollNo = 10; but we need to declare the variable as a static variable..
//    }
//
//    //You can initialize the final variable into the constructor also
//    public Student() {
//        name = "Ganesh";
//    }

    public final void getDescription() {
        System.out.println("Inside the Student class " + name);
    }
}
