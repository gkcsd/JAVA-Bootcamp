package collectionparttwo.wildcard;

import java.util.ArrayList;

class StudentFour {
//    This is parent class code
}
class EnggStudentFour extends StudentFour {
//    This is chid class code
}

public class WildCardUpperBound {
    public static void main(String[] args) {
        ArrayList<? extends StudentFour> al1 = new ArrayList<>();
        ArrayList<EnggStudentFour> al2 = new ArrayList<>();
        al1 = al2;
//        This is called UpperBounding it refers to their decendents
    }
}
