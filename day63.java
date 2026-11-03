import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        long hasil = 1;

        System.out.print("masukn nilai m : ");
        int m = s.nextInt();

        System.out.print("masukkan nilai n : ");
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            hasil *= m;
        }
        System.out.printf("Hasil dari %d pangkat %d = %d",m,n,hasil);

    }
}

