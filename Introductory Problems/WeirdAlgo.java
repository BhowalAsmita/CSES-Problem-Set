import java.lang.*;
import java.util.*;

class WeirdAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n + " ");
        while (n != 1) {             
            n = pattern(n);
            System.out.print(n + " ");

        }
    }

    public static long pattern(long n) {
        if (n % 2 == 0) {
            n = n / 2;
            return n;
        } else {
            n = n * 3 + 1;
            return n;

        }

    }
}
