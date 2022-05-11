package recursion;

public class SumOfFirstNNaturalNumbers {
    
    public static int findSumOfNaturalNumbers(int num) {
        if(num == 0) return 0;
        else if(num == 1) return 1;

        else return num + findSumOfNaturalNumbers(num-1);
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.printf("%d", findSumOfNaturalNumbers(num));
    }
}