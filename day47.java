import java.util.Scanner;

public class lat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai = sc.nextInt();

        if (nilai >= 80 && nilai <=100) {
            System.out.println("A");
        } else if (nilai >= 70 && nilai <=79) {
            System.out.println("B");
        } else if (nilai >= 60 && nilai <=69) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
