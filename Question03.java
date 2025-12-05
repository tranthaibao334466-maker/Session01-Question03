import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tu so 1: ");
        int tu_1 = scanner.nextInt();
        System.out.print("Mau so 1: ");
        int mau_1 = scanner.nextInt();
        System.out.print("Tu so 2: ");
        int tu_2 = scanner.nextInt();
        System.out.print("Mau so 2: ");
        int mau_2 = scanner.nextInt();
        System.out.printf("Tong cua hai phan so: %d/%d", tu_1*mau_2 + tu_2*mau_1, mau_1*mau_2);
    }
}
