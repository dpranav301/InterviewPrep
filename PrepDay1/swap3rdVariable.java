import java.util.Scanner;

public class swap3rdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("Before swapping i=" + i + "j=" + j);
        swap(i, j);
    }

    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
        System.out.println("After swapping i=" + i + "j=" + j);
    }
}
