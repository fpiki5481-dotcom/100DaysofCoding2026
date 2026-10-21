import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input angka : ");
        int angka = sc.nextInt();

        String a = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println("angka yg anda input bilangan " + a);
    }
}
