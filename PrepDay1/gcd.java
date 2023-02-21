public class gcd {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        System.out.println(GCD(a, b));
    }

    static int GCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        return a;
    }
}
