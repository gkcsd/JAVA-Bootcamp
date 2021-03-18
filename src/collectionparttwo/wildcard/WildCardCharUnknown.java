package collectionparttwo.wildcard;

import java.util.ArrayList;

class StudentTwo {
//    This is parent class code
}
class EnggStudentTwo extends StudentTwo {
//    This is Chid class code
}

public class WildCardCharUnknown {
    public static void main(String[] args) {
        ArrayList<StudentTwo> al1 = new ArrayList<>();
        ArrayList<EnggStudentTwo> al2 = new ArrayList<>();
//        al1 = al2;
//        But it shows compiler error because StuentTwo class is not the parent of EnggStuentTwo class
    }
}
