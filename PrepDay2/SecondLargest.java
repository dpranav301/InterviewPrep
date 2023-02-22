class SecondLargest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };

        int i = second(a);
        System.out.println(a[i]);
    }

    static int second(int[] a) {
        int res = -1;
        int largest = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[largest]) {
                res = largest;
                largest = i;
            } else if (a[i] != a[largest]) {
                if (res == -1 || a[i] > a[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
}
