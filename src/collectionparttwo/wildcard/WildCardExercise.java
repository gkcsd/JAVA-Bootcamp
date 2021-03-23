package collectionparttwo.wildcard;

import java.util.ArrayList;

class StudentClass {
    void print() {
        System.out.println("I am Student class");
    }
}
class EnggStudentClass extends StudentClass {
    void print() {
        System.out.println("I am Engineering Student Class");
    }
}
class ManagementStudentClass extends StudentClass {
    void print() {
        System.out.println("I am Management Student class");
    }
}

public class WildCardExercise {
    public static void main(String[] args) {
        ArrayList<EnggStudentClass> al1 = new ArrayList<>();
        al1.add(new EnggStudentClass());
        al1.add(new EnggStudentClass());

        ArrayList<ManagementStudentClass> al2 = new ArrayList<>();
        al2.add(new ManagementStudentClass());

        printStudent(al1);
        printStudent(al2);
    }
    public static void printStudent(ArrayList<? extends StudentClass> al) {
        for(StudentClass s : al) {
            s.print();
        }
    }
}






/*
Hii
This is Ganesh kale and i am b.tech computer engineering student and i have 2 years of experience in programming
world, I am working as software developer in America at California.

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

*/