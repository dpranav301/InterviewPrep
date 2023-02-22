import java.util.*;

class IntersectionUnsorted {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
        union(a, b);
    }

    static void union(int[] a, int[] b) {
        TreeSet ts = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            ts.add(b[i]);
        }
        System.out.println("Union is ");
        System.out.println(ts);
    }

}
