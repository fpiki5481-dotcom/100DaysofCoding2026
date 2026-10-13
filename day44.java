import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nilai ujian : ");
        int nilai = sc.nextInt();

        if (nilai >= 90 && nilai <=100 ) {
            System.out.println("predikat nilai : " + "A");
        } else if (nilai >= 75 ) {
            System.out.println("predikat nilai : " + "B");
        } else if (nilai >= 60 ) {
            System.out.println("predikat nilai : " + "C");
        } else if (nilai >= 40 ) {
            System.out.println("predikat nilai : " + "D");
        }
        else {
            System.out.println("predikat E karena YA' APA PA' OOOOO nilai dibawah 40 iii ");
        }
    }
}
