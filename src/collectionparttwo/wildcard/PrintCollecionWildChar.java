package collectionparttwo.wildcard;

import java.util.Collection;

public class PrintCollecionWildChar {
    public static void main(String[] args) {
        printCollection(c);
    }

    public static void printCollection(Collection<?> c) {
        for (object e: c) {
            System.out.println(c + " ");
        }
    }
}
