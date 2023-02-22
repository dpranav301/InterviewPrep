public class Zero_At_End {
    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 0, 3, 4, 0, 5, 6 };
        // int[] b = new int[a.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[z] = a[i];
                z++;
            }

        }
        while (z < a.length) {
            a[z] = 0;
            z++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
