package javacollectiontutorialPrograms.javaproblemstatement;

public class UnInitializedArray {
    public static void main(String[] args) {
        int[] a = new int[4];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
