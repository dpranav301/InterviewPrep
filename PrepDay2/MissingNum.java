import java.util.Scanner;

class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int N = sc.nextInt();
        int[] a = new int[N];
        int arrSum = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the element");
            a[i] = sc.nextInt();
            arrSum += a[i];
        }
        int sum = N * (N + 1) / 2;
        System.out.println("Missing number is=" + (sum - arrSum));
    }
}