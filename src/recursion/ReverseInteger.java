package recursion;

public class ReverseInteger {
    
    public static int reverseInt(int num, int reverse, int remainder) {
        System.out.println(num + " -> ");
            remainder = num%10;
            reverse = reverse*10 + remainder;
        if(num < 10) return num;
        else {
            reverseInt(num/10, reverse, remainder);
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverseInt(num, 0, 0));

    }
}
