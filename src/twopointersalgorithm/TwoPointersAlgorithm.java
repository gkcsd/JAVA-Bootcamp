package twopointersalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointersAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i<n;i++) {
                a[i]=sc.nextInt();
            }
            Triplet g = new Triplet();
            if(g.findTriplets(a,n)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}

class Triplet{
    public boolean findTriplets(int arr[], int n) {
        arr.sort();
    }

    public boolean twoSum(int a[], int x) {
        int i = 0, j = a.length - 1;

        while (i < j) {
            if (a[i] + a[j] > x) {
                j--;
            } else if(a[i] + a[j] < x) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}