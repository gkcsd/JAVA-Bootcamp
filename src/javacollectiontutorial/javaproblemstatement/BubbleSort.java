package javacollectiontutorial.javaproblemstatement;

class BubbleSortClass {
    public void sortArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSortClass obj = new BubbleSortClass();

        int arr[] = {2,5,4,7,9,6,3,45,6};


        System.out.println("Before Sorted Array Is: ");
        obj.printArray(arr);

        obj.sortArray(arr);

        System.out.println("The Sorted Array Is: ");
        obj.printArray(arr);
    }
}
