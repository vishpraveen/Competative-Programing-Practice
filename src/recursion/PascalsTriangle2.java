package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalsTriangle2 {
    
    public static void getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= rowIndex; i++) {
            for(int j = 1; j<=i; j++) {
                int result = calPascals(i,j);
                if(i == rowIndex) list.add(result);
                System.out.print(result);
            }
            System.out.println("");
        }

       System.out.println(list);
    }

    public static int calPascals(int row, int col) {
        if(col == 1 || col == row) return 1;

        return calPascals(row-1, col-1) + calPascals(row-1, col);
    }

    public static void main(String args[]) {
        getRow(3);
    }
}
