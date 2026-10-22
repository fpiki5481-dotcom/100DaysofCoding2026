import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("angka perulangan yg di input : ");
        int a = sc.nextInt();
        for (;a <= 8; a++) {
            System.out.println("perulangan ke " + a);
        }
    }
}
