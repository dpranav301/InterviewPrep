import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to rotate");
        int rotate = sc.nextInt();
        int[] temp = new int[rotate];
        for (int i = 0; i < rotate; i++) {
            temp[i] = a[i];
        }
        for (int i = rotate; i < a.length; i++) {
            a[i - rotate] = a[i];
        }
        for (int i = 0; i < rotate; i++) {
            a[a.length - rotate + i] = temp[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
