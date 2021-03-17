package collectionparttwo;
////Without generics it shows the runtime error and generates ClassCastException
//class Pair {
//    object x;
//    object y;
//}
//
//public class TypeSafety {
//    public static void main(String[] arg) {
//        Pair p = new Pair();
//        p.x = 10;
//        p.y = "Ganesh";
//        String s = (String)p.x;
//    }
//}

//with generics it shows compiler time error which more understandable than runtime error

class PairTwo<T,S> {
    T x;
    S y;
}

public class TypeSafety {
    public static void main(String[] args) {
        PairTwo<Integer,String> p = new PairTwo<Integer,String>();
        p.x = 10;
        p.y = "Ram";
        String str = (String)p.y;
    }
}

