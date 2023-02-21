import java.util.Scanner;

public class positiveNagative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        if (i < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Positive");
        }
    }
}
