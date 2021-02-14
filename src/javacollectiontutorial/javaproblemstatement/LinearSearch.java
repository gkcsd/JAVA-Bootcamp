package javacollectiontutorial.javaproblemstatement;

public class LinearSearch {
    public static void main(String[] args) {

        int[] items = { 10,20,5,7,60,75,91,52,10};
        int x = 91;

        int result  = linearSearch(items, x);

        if (result == -1) {
            System.out.println("The given item is not present in the array");
        }else {
            System.out.println("The given element present in the array");
        }
    }

    static int linearSearch(int items[], int x) {
        int n = items.length;
        for (int i = 0; i < n; i++) {
            if (items[i] == x) {
                return 1;
            }
        }
        return -1;
    }
}
