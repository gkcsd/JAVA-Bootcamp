package sortType;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {4,5,7,12,-6,8,23};
        int n = a.length;

        for(int i = 0; i < n-1; i++ ) {
            int maxIndex = i;
            for (int j = i; j < n; j++) {

                if (a[j] < a[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
        for (int num : a) {
            System.out.print(num + "  ");
        }
    }
}
