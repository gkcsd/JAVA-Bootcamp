package javacollectiontutorialPrograms.javaproblemstatement;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int n = arr.length;
        int x = 20;

        int result = binarySearch(arr, 0, n - 1, x);

        if (result == -1) {
            System.out.println("Item is not present");
        } else {
            System.out.println("Item is present");
        }
    }

    static int binarySearch(int arr[], int l, int r, int x ) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);

        }
        return -1;
    }
}
