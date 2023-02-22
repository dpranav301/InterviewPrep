import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
