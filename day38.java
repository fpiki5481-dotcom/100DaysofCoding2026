import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENU MAKANAN ====");
        System.out.println("1. bakso bakar ");
        System.out.println("2. nasi goreng ");
        System.out.println("3. ayam krispi ");
        System.out.println("4. nasi campur ");
        System.out.println("======================");

        System.out.print("pilih menu : ");
        int menuMakanan = sc.nextInt();

        if (menuMakanan == 1) {
            System.out.println("harga bakso bakar : Rp.15.000");
        } else if (menuMakanan == 2) {
            System.out.println("harga nasi goreng : Rp.13.000");
        } else if (menuMakanan == 3) {
            System.out.println("harga ayam krispi : Rp.20.000");
        } else if (menuMakanan == 4) {
            System.out.println("harga nasi campur : Rp.25.000");
        }
        else {
            System.out.println("tidak ada didaftar menu");
        }
    }
}
