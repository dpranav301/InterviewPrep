class AvgArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        double sum = 0;
        for (int b : a) {
            sum = sum + b;
        }
        System.out.println("Avg is=" + sum / (a.length));
    }
}