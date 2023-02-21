public class palindrom {
    public static void main(String[] args) {
        int a = 1113;
        int copy = a;

        int rev = 0;
        while (a > 0) {
            rev = 10 * rev + a % 10;
            a = a / 10;
        }
        if (copy == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrom");
        }
    }
}
