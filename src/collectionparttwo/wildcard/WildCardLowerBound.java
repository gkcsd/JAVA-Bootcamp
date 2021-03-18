package collectionparttwo.wildcard;

import java.util.ArrayList;

class StudentFive {
//    This is parent class code
}

class EnggStudentFive extends StudentFive {
//    This is child class code
}

public class WildCardLowerBound {
    public static void main(String[] args) {
        ArrayList<? super Student> al1 = new ArrayList<>();
        ArrayList<Object> al2 = new ArrayList<>();
        al1 = al2;
//        This is called lower bounding
    }
}
