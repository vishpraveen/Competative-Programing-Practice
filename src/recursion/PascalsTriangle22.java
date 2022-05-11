package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle22 {

    public static int[] calPasTri(int n) {
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(generatePasValues(i, j, arr)+ " ");
                arr[i][j] = generatePasValues(i, j, arr);
            }
            System.out.println(Arrays.toString(arr[i])); 
            System.out.println("");
        }
        
        

        return arr[n-1];
        // System.out.println(Arrays.toString(arr));
    }

    public static int generatePasValues(int row, int col, int[][] arr) {
        if(col == 0 || row == col) return 1;
        return arr[row-1][col-1]+ arr[row-1][col];
        // return generatePasValues(arr[row-1][col-1], arr) + generatePasValues(arr[row-1][col], arr);
    }

    public static void main(String[] args) {
        System.out.println("Result: "+Arrays.toString(calPasTri(4)));
    }
}
