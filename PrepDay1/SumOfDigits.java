import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        System.out.println(digits(num));
    }

    static int digits(int nums) {
        int sum = 0;
        while (nums > 0) {
            sum = sum + nums % 10;
            nums = nums / 10;
        }
        return sum;
    }
}
