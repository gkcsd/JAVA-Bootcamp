package javacollectiontutorial.javaproblemstatement;

class Ref {
    int x,y;

    Ref(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class NonPrimitiveReferenceAtContiLoc {
    public static void main(String[] args) {
        Ref[] a = {
                new Ref(5,6),
                new Ref(10,20),
                new Ref(30,40)
        };

        for (int i = 0; i < a.length; i ++) {
            System.out.println(a);
        }
    }
}
