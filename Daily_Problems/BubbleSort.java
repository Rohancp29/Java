import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 5, 7, 9, 2, 1, 8 };
        int n = arr.length;
        int i;
        for ( i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (int k =0;k<n;k++)
        System.out.print(arr[k]+" ");    }

}