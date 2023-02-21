import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = 0;
        while (a != 0 && b != 0 && c != 0) {
            a--;
            b--;
            c--;
            d++;
        }
        System.out.println("Smallest is=" + d);

        System.out.println(small(a, b, c));
    }

    static int small(int x, int y, int z) {
        if (y / x != 1) {
            return (y / z != 1 ? y : z);
        } else {
            return (x / z != 1 ? x : z);
        }
    }
}
