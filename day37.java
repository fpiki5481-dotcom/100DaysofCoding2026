import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //percabangan menentuan bilangan positif, negatif, atau nol

        double angka = sc.nextDouble();

        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif" );
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif");
        } else {
            System.out.println("angka tersebut adalah nol (0)");
        }
    }
}
