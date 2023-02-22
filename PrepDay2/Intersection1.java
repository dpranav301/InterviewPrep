import java.util.HashSet;

public class Intersection1 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

        intersection(a, b);
    }

    static void intersection(int[] a, int[] b) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        System.out.println("Intersction");
        for (int i = 0; i < b.length; i++) {
            if (s.contains(b[i])) {
                s1.add(b[i]);
            }
        }
        System.out.println(s1);
    }
}
