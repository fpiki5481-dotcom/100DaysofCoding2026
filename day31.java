import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //operator logika AND (&&),OR (||), dan NOT (!)

        System.out.print("masukkan usia : ");
        int usia = sc.nextInt();

        System.out.print("sudah punya KTP : ");
        boolean ktp = sc.nextBoolean();


        System.out.println("AND : " + (usia >= 18 && ktp));
        System.out.println("OR : " + (usia >= 18 || ktp));
        System.out.println("NOT : " + (!ktp));

        }

    }

