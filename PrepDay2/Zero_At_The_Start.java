public class Zero_At_The_Start {
    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 0, 4, 5, 6, 0, 8 };
        int[] b = new int[a.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                b[z] = a[i];
                z++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[z] = a[i];
                z++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
