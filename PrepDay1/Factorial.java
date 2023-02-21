import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        int b = facto(i);
        System.out.println(b);
    }

    static int facto(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }
}
