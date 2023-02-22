import java.util.HashSet;

public class Union_Sorted_Array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] b = { 1, 2, 3, 7, 8, 9 };

        HashSet s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }
        System.out.println("After Union");
        System.out.println(s);
    }
}
