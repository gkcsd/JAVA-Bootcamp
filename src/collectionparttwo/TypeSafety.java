package collectionparttwo;
//Without generics it shows the runtime error and generates ClassCastException
class Pair {
    object x;
    object y;
}

public class TypeSafety {
    public static void main(String[] arg) {
        Pair p = new Pair();
        p.x = 10;
        p.y = "Ganesh";
        String s = (String)p.x;
    }
}

