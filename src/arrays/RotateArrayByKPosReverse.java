package arrays;

import java.util.Arrays;

public class RotateArrayByKPosReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k =2;
        reverseArrByKPos(arr, k);
    }

    public static void reverseArrByKPos(int[] arr, int k) {
        int length = arr.length;
        reverseArr(arr, 0, length-k-1);
        reverseArr(arr, length-k, length-1);
        reverseArr(arr, 0, length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
