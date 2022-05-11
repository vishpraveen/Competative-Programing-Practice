package recursion;

public class PascalsTriangle {
    
    public static void printPascalsTriangle(int num) {

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(printPrevValues(i, j)+" ");
            }
            System.out.println("\n");
        }
    }

    public static int printPrevValues(int i, int j) {
        if(j == 1 || j == i) 
        return 1;

        else {
            return printPrevValues(i-1, j-1) + printPrevValues(i-1, j);
        }
    }
    
    public static void main(String args[]) {
        printPascalsTriangle(5);
    }
}
