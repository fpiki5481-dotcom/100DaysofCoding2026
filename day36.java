import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menentukan bilangan ganjil genap
        int angka = sc.nextInt();

        if (angka %4 == 0) {
            System.out.println("bilangan yang genap");
        }else {
            System.out.println("bilangan yang ganjil");
        }

    }
}
