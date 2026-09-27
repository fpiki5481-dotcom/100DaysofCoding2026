import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menghitung luas segitiga
        
        int alas = sc.nextInt();
        int tinggi = sc.nextInt();

        double luasSegitiga = 0.5 * alas * tinggi;

        System.out.printf("%.1f",luasSegitiga);
    }
}
