package recursion;

public class CheckIfNumberIsPalindrome {
    
    public static String checkIfPalindrome(String num, int position) {
        if(num == null || num.isEmpty() || position <= num.length()) return null;
        else checkIfPalindrome(num, position++);
        return ""+ num.charAt(position);
    }

    public static void main(String[] args) {
        String input = "2004";
        String result = checkIfPalindrome(input, 0);
        System.out.println(result);
        if (result == input) {
           System.out.println("Palindrome"); 
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
