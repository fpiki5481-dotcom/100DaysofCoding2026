import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int angka = s.nextInt();

        long hasil = 1;

        for(int i = 1; i <= angka; i++){
            hasil *= i;
        }
        System.out.printf("Faktorial dari angka %d adalah %d",angka,hasil);
    }
}
