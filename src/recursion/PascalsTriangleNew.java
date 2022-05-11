package recursion;

public class PascalsTriangleNew {
    public static void main(String[] args) {
    
        printPascalsTriangle(3);
    }

    public static void printPascalsTriangle(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <=i; j++) {
               System.out.print( getValue(i,j));
            }
            System.out.println("\n");
        }
    }

    public static int getValue(int i, int j) {
        if(j ==1 || j == i) return 1;
        else return getValue(i-1, j-1) + getValue(i-1, j);
    }
}
