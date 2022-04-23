import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        System.out.println(convert(a, n));
    }

    static int convert(int a, int n) {
        if (a == n) {
            return 0;
        }
        if (a > n) {
            return a - n;
        }
        if (a <= 0 && n > 0) {
            return -1;
        }
        if (n % 2 == 1) {
            return 1 + convert(a, n + 1);
        } else {
            return 1 + convert(a, n / 2);
        }
    }
}