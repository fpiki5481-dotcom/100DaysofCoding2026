
import java.util.Scanner;

public class day12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nama anda : ");
        String nama = in.nextLine();

        System.out.print("masukkan umur anda : ");
        int umur = in.nextInt();
        in.nextLine();

        System.out.print("masukkan alamat anda : ");
        String alamat = in.nextLine();

        System.out.print("masukkan tinggi badan anda : ");
        double tinggi_badan = in.nextDouble();

        System.out.println(" ");
        System.out.println("=====BIO DATA=====" + "\n");

        System.out.println("Nama saya adalah : " + nama);
        System.out.println("Umur saya adalah : " + umur);
        System.out.println("Alamat saya adalah : " + alamat);
        System.out.println("tinggi badan saya adalah : " +  tinggi_badan);

        in.close();
    }
}
