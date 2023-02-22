import java.util.Arrays;
import java.util.Scanner;

// class PairOfSum {
//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3, 4, 5, 6, 7 };
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the sum");
//         int sum = sc.nextInt();

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a.length; j++) {
//                 if ((a[i] + a[j]) == sum) {
//                     System.out.println("Pair is " + a[i] + " and " + a[j]);
//                 }
//             }
//         }
//     }
// }

class XYZ {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        Arrays.sort(a);
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            if ((a[low] + a[high]) == sum) {
                System.out.println("Pair is(" + a[low] + "," + a[high] + ")");
                return;
            }

            if ((a[low] + a[high]) < sum) {
                low++;

            } else {
                high--;
            }

        }
        System.out.println("Pair Not Found");

    }
}
