package recursion;

public class NumberPower {

    public static Long calPower(Long n, Long power) {
        if(power == 1) return n;

        return n * calPower(n, power-1);
    }

    public static void main(String args[]) {
        System.out.print(calPower(11L,13L));
    }
}
