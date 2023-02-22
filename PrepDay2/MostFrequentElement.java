public class MostFrequentElement {
    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 1, 5 };
        int mf = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mf = a[i];
            }
        }
        System.out.println("Most frequesnt element is=" + mf);
    }
}
