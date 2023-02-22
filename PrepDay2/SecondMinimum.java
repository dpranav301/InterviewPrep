public class SecondMinimum {
    public static void main(String[] args) {
        int[] a = { 523, 45, 6, 57 };
        int x = min(a);
        System.out.println(a[x]);
    }

    static int min(int[] a) {
        int secondMin = 0;
        int res = 0;
        int mini = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[mini]) {
                mini = i;
            }
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] != a[mini]) {
                if (a[i] < a[res]) {
                    res = i;
                }

            }
        }
        return res;

    }
}
