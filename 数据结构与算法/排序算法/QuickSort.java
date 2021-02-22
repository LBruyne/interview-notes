import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 0};
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]);
    }

    public static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if(leftIndex >= rightIndex) return;

        int left = leftIndex;
        int right = rightIndex;
        int key = arr[leftIndex];

        while(left < right) {
            while(arr[right] >= key && right > left) right--;
            arr[left] = arr[right];
            while(arr[left] <= key && right > left) left++;
            arr[right] = arr[left];
        }

        arr[left] = key;
        quickSort(arr, leftIndex, left - 1);
        quickSort(arr, rightIndex, right + 1);
    }
}