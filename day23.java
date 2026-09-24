import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        int sisi, hasil;

        System.out.print("masukkan sisi: ");
        sisi = ab.nextInt();

        hasil = sisi * sisi;

        System.out.println("luas persegi adalah: " + hasil);

    }
}
