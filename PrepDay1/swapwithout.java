import java.util.Scanner;

public class swapwithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("Before swapping i=" + i + "j=" + j);
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("After swapping i=" + i + "j=" + j);
    }
}
