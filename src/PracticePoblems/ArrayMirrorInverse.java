package PracticePoblems;

public class ArrayMirrorInverse {
    public static void main(String[] args) {
        int[] arr = {2,5,8,3};

        if(mirrorInverse(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean mirrorInverse(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[arr[i]] != i) {
                return false;
            }
        }
        return true;
    }
}
