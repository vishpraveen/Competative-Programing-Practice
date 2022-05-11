package recursion;

public class PrintReverseString {
    
    public static void printStringReverse(String s, int position) {
        
        if(s == null || s.isEmpty() || position >= s.length()) return;
        else printStringReverse(s, position+1);
        System.out.print(s.charAt(position));
    }

    public static void main(String[] args) {
        String value = "Done";
        printStringReverse(value, 0);
    }
}
