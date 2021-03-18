package collectionparttwo.wildcard;

class Student {
    //This is parent class
}
class EnggStudent extends Student {
//    This is Child class
}

public class InheritanceExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        EnggStudent s2 = new EnggStudent();
        s1= s2;
    }
}
