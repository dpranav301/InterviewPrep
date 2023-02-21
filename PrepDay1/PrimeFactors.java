import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        prime(num);
    }

    static void prime(int num) {
        if (num <= 1) {
            return;
        }
        while (num % 2 == 0) {
            System.out.println(2);
            num = num / 2;
        }
        while (num % 3 == 0) {
            System.out.println(3);
            num = num / 3;
        }
        for (int i = 5; i * i <= num; i = i + 6) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
            while (num % (i + 2) == 0) {
                System.out.println(i + 2);
                num = num / (i + 2);
            }
        }
        if (num > 3) {
            System.out.println(num);
        }
    }
}
