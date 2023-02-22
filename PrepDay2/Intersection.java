public class Intersection {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6 };
        int[] b = { 1, 2, 3, 4, 6 };
        int[] c = new int[a.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                c[z] = a[i];
                z++;
            }
        }
        for (int i = 0; i < z; i++) {
            System.out.println(c[i] + " ");
        }
    }
}
