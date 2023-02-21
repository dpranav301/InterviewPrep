import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}