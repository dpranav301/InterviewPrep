import java.util.Scanner;

public class ArmstrongNumBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            {
                int n = i;
                // int copy=n;
                int Digit = digits(n);

                boolean armstrong = Arm(n, Digit);
                if (armstrong) {
                    System.out.println(i + " ");
                }
            }

        }

    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static boolean Arm(int n, int d) {
        int copy = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) (Math.pow(rem, d));
            n = n / 10;
        }
        if (copy == sum) {
            return true;
        } else {
            return false;
        }
    }

}
