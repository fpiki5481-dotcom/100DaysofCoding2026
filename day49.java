import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input nilai : ");
        int nilai = sc.nextInt();

        String status = (nilai >= 70) ? "LULUS" : "TIDAK LULUS";

        System.out.println("Nilai : " + nilai);
        System.out.println("Status : " + status) ;
    }
}
