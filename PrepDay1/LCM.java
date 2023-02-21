public class LCM {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int lcm = (a * b) / gcd(a, b);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {
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
