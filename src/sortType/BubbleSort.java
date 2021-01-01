package sortType;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4,5,87,1,-8,69,56,7};
        int n = a.length;

        boolean sorted = true;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (a[j+1] < a[j]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;

                    sorted = false;
                }
            }
            if (sorted) break;
        }

        for (int num : a) {
            System.out.print(num + "  ");
        }
    }
}
