package arrays;

import java.util.Arrays;

class RotateArrayByKPos {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateArrByKPos(arr, k);
    }

    private static void rotateArrByKPos(int[] arr, int k) {
        int size = arr.length-1;
        int temp;
        int count = 0;
        
        while(count < k) {
            temp = arr[size];
            for(int i = size; i >=1; i--)
                arr[i] = arr[i-1];
            arr[0] = temp;
            count++;
        }

        System.out.println(Arrays.toString(arr));
        
    }

    
}