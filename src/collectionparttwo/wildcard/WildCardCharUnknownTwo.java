package collectionparttwo.wildcard;

import java.util.ArrayList;

class StudentThree {
//    This is parent class code
}
class EnggStudentThree extends StudentThree {
//    This is child class code
}

public class WildCardCharUnknownTwo {
    public static void main(String[] args) {
        ArrayList<?> al1 = new ArrayList<>();
        ArrayList<EnggStudentThree> al2 = new ArrayList<>();
        al1 = al2;
//        It runs and compile fine because of ? sign indicates the unknown type
    }
}
