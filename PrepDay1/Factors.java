import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        factor(num);
    }

    static void factor(int num) {
        int i;
        for (i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (num % i == 0) {
                System.out.println(num / i);
            }
        }
    }
}
